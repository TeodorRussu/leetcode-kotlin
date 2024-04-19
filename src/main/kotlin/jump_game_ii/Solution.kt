package jump_game_ii

class Solution {
    fun jump(nums: IntArray): Int {
        if (nums.size == 1) {
            return 0
        }
        var steps = mutableListOf(nums.size - 1)
        var lastAddedStepIndex = -1;

        for (numIndex in nums.size - 2 downTo 0) {
            val numberValue = nums[numIndex]

            for (stepIndex in 0 until steps.size) {
                val step = steps[stepIndex]
                if (numIndex + numberValue >= step) {
                    lastAddedStepIndex = stepIndex + 1
                    steps.add(index = lastAddedStepIndex, numIndex)
                    break
                }
            }
        }
        return lastAddedStepIndex
    }
}