package product_of_array_except_self

class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        var totalProduct = 1
        var totalProductWithoutZero = 1
        val outputArray = IntArray(nums.size)

        var zeroOccurences = 0

        for (num in nums) {
            totalProduct *= num
            if (num == 0) {
                zeroOccurences++
                if (zeroOccurences > 1) { // that means the input contains multiple zero values, and the total product will always be zero
                    totalProduct = 0
                    totalProductWithoutZero = 0
                    break
                }
                continue
            }
            totalProductWithoutZero *= num
        }

        for (index in nums.indices) {
            when (nums[index]) {
                0 -> outputArray[index] = totalProductWithoutZero
                else -> outputArray[index] = totalProduct / nums[index]
            }
        }
        return outputArray
    }
}