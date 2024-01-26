package majority_element

import java.util.TreeMap

class Solution {
    fun majorityElement(nums: IntArray): Int {
        val elementsCounter = mutableMapOf<Int, Int>()
        var majorityElement = nums[0]
        var majorityElementCount = 0

        nums.forEach {
            val currentCount = elementsCounter.getOrDefault(key = it, defaultValue = 0) + 1
            elementsCounter[it] = currentCount
            if (currentCount > majorityElementCount) {
                majorityElement = it
                majorityElementCount = currentCount
            }
        }
        return majorityElement
    }
}