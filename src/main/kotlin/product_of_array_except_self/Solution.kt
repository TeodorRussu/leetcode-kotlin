package product_of_array_except_self

class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        if (nums.size <= 1) return nums
        var outputArray = IntArray(nums.size)
        val segmentSize = determineSegmentSize(nums)
        val segmentsProducts = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            val currentNum = nums[i]
            val segmentHash = i / segmentSize
            if (segmentsProducts[segmentHash] == null) {
                segmentsProducts[segmentHash] = 1
            }
            segmentsProducts[segmentHash] = segmentsProducts[segmentHash]!! * nums[i]
        }

        for (i in nums.indices step segmentSize) {

            val currentSegmentHash = i / segmentSize
            var otherSegmentsProduct = 1
            segmentsProducts.forEach { (key, value) ->
                if (key != currentSegmentHash) {
                    otherSegmentsProduct *= value
                }
            }
            for (j in 0..<segmentSize) {
                val currentSegmentStartindex = i
                var currentSegmentEndindex = i + segmentSize - 1
                if (currentSegmentEndindex > nums.lastIndex)
                    currentSegmentEndindex = nums.lastIndex

                val currentNumberIndex = i + j
                var currentSegmentProductWithoutCurrentNumber = 1
                for (k in currentSegmentStartindex..currentSegmentEndindex) {
                    if (k != currentNumberIndex) {
                        currentSegmentProductWithoutCurrentNumber *= nums[k]
                    }
                }
                outputArray[currentNumberIndex] = currentSegmentProductWithoutCurrentNumber * otherSegmentsProduct

                if (currentNumberIndex == nums.lastIndex)
                    break
                print(currentSegmentProductWithoutCurrentNumber * otherSegmentsProduct)
            }
        }

        return outputArray
    }

    private fun determineSegmentSize(nums: IntArray): Int {
        val inputSize = nums.size
        if (inputSize <= 5)
            return inputSize
        return inputSize / 5
    }

}
