package gas_station

class Solution {
    fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {

        var startIndex = 0
        var totalGas = 0
        var currentGas = 0

        for (i in gas.indices) {
            val netGain = gas[i] - cost[i]
            totalGas += netGain
            currentGas += netGain
            if (currentGas < 0) {
                startIndex = i + 1
                currentGas = 0
            }
        }

        if (totalGas < 0)
            return -1
        return startIndex
    }
}
