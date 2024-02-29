package jump_game

/*Example
    value: 3, 5, 0, 0, 4
    index: 0, 1, 2, 3, 4

    iteration 1: checked index: 3, target index 4. we verify if we can jump to the target(3 + 0 < 4): no we can't - target remains the last index - 4
    iteration 2: checked index: 2, target index 4. we verify if we can jump to the target(2 + 0 < 4): no we can't - target remains the last index - 4
    iteration 3: checked index: 1, target index 4. we verify if we can jump to the target(1 + 5 > 4): we can - in this case we can assume that
                                                                                                      if precedent indexes can reach the current index,
                                                                                                      then we can jump to the target - so the new target becomes the current index - 1
    iteration 4: checked index: 0, target index 1. we verify if we can jump to the target(0 + 3 > 1): we can - current index becomes the target
    if at the end the target becomes the index 0, that means there is possible to jump from 0 to the initial target, and we return true.
 */
class Solution {
    fun canJump(nums: IntArray): Boolean {
        var targetIndex = nums.lastIndex

        for (index in nums.lastIndex - 1 downTo 0) {
            val currentValue = nums[index]
            if ((currentValue + index) >= targetIndex) {
                targetIndex = index
            }
        }

        return 0 == targetIndex
    }
}




