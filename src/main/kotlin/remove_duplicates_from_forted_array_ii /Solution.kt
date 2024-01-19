package `remove_duplicates_from_forted_array_ii `

import java.util.TreeMap

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        val itemsWithOccurences = TreeMap<Int, Int>()

        nums.forEach {
            addNumToMapItemsWithOccurrences(it, itemsWithOccurences, 2)
        }
        var outputIndex = 0

        itemsWithOccurences.forEach {
            val number = it.key
            var occurences = it.value

            for (i in 0 until occurences) {
                nums[outputIndex] = number
                outputIndex++
            }
        }

        return outputIndex;
    }

    private fun addNumToMapItemsWithOccurrences(number: Int, itemsWithOccurences: TreeMap<Int, Int>, limit: Int) {
        var currentOccurencesCount = itemsWithOccurences.getOrDefault(key = number, defaultValue = 0)

        if (currentOccurencesCount < limit) {
            currentOccurencesCount++
            itemsWithOccurences[number] = currentOccurencesCount
        }
    }
}