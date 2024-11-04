package gas_station

class Solution {
    fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {

        if(gas.size == 1)
            return if (gas[0]-cost[0] >= 0) 0 else -1

        val candidateStartIndexes = mutableListOf<Int>() // the gas value should be at least equal to the cost value
        var costVsAvailability = 0

        for (i in gas.indices) {
            val currentAvailabilityVsCost = gas[i] - cost[i]
            val previousIndexInCircuit = if (i == 0) gas.lastIndex else i - 1
            val previousAvailabilityVsCost = gas[previousIndexInCircuit] - cost[previousIndexInCircuit]
            if (currentAvailabilityVsCost >= 0 && previousAvailabilityVsCost < 0) {
                candidateStartIndexes.add(i)
            }
            costVsAvailability += currentAvailabilityVsCost
        }
        if (costVsAvailability < 0) {
            return -1
        }

        for (i in candidateStartIndexes) {
            var result = verifyCircuit(gas, cost, i)
            if (result)
                return i
        }
        return -1
    }

    private fun verifyCircuit(gas: IntArray, cost: IntArray, i: Int): Boolean {
        var currentIndexCostVsAvalability = gas[i] - cost[i]
        var totalCostVsAvailability = currentIndexCostVsAvalability
        var canMoveForward = true
        var j = i

        while (canMoveForward) {
            if (totalCostVsAvailability >= 0) {
                if (j == gas.lastIndex) {
                    j = 0
                } else
                    j++
            }
            currentIndexCostVsAvalability = gas[j] - cost[j]
            totalCostVsAvailability += currentIndexCostVsAvalability
            if (totalCostVsAvailability < 0)
                return false
            if (j == i)
                return true
        }
        return false
    }
}