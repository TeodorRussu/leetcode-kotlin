package rotate_array

class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {

        val arrayLastIndex = nums.size - 1
        for (i in 0..<k) {
            var tempIndex = arrayLastIndex

            while (tempIndex > 0) {
                //swap
                val tempNum = nums[tempIndex]
                nums[tempIndex] = nums[tempIndex - 1]
                nums[tempIndex - 1] = tempNum
                tempIndex--
            }
        }
    }
}