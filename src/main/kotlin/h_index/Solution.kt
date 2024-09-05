package h_index

class Solution {
    fun hIndex(citations: IntArray): Int {
        var biggestValue = 0
        val occurrences = mutableMapOf<Int, Int>()
        for (value in citations) {
            occurrences[value] = 1 + occurrences.getOrDefault(value, 0)
            if (value > biggestValue)
                biggestValue = value
        }

        var biggerorSameNumbersOccurrences = 0

        for (i in 1000 downTo 1) {
            biggerorSameNumbersOccurrences += occurrences.getOrDefault(i, 0)
            if (biggerorSameNumbersOccurrences >= i)
                return i
        }
        return 0
    }
}