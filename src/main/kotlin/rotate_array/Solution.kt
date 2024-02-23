package rotate_array

class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        val step = k % nums.size
        val arrayLastIndex = nums.size - 1

        //reverse the entire array
        reverseArray(nums, 0, arrayLastIndex)
        //reverse the numbers with index between 0 .. step
        reverseArray(nums, 0, step - 1)
        //reverse the numbers with index between step .. array end
        reverseArray(nums, step, nums.size - 1)
    }

    fun reverseArray(nums: IntArray, from: Int, to: Int) {
        var start = from
        var end = to

        while (start < end) {
            val temp = nums[start]
            nums[start] = nums[end]
            nums[end] = temp
            start++
            end--
        }
    }
}