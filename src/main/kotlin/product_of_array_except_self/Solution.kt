package product_of_array_except_self

class Solution {
    /*
        Explanation:
        Left to Right Traverse : Create the output array by iterating through the nums array, and filling each output[i]
        with the product of all elements to the left of i.
        Right to Left Traverse: We then iterate the array from right to left,
        updating the output[i] by multiplying the existing output[i] value with the product of all elements to the right of i.
       */
    fun productExceptSelf(nums: IntArray): IntArray {
        val output = IntArray(nums.size)
        val reverseOutput = IntArray(nums.size)

        var leftProduct = 1
        for (i in 0..nums.lastIndex) {
            output[i] = leftProduct
            leftProduct *= nums[i]
        }

        var rightProduct = 1
        for (i in nums.lastIndex downTo 0) {
            output[i] *= rightProduct
            rightProduct *= nums[i]
        }


        return output
    }

}
