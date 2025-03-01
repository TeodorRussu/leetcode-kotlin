package move_zeroes_283

class Solution {
    fun moveZeroes(nums: IntArray) {
        if (nums == null || nums.size <= 1) {
            return
        }

        var nonZeroIndex = 0;
        for (i in nums.indices) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i]
                if (nonZeroIndex != i) {
                    nums[i] = 0
                }
                nonZeroIndex++
            }
        }
    }
}
