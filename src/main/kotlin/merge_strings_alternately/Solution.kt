package merge_strings_alternately

import java.lang.StringBuilder

class Solution {
    fun mergeAlternately(word1: String, word2: String): String {

        val output = StringBuilder()
        val word1Length = word1.length
        val word2Length = word2.length
        val loopRangeLimit = if (word1Length > word2Length) word1Length else word2Length

        for (i in 0..<loopRangeLimit) {
            if (i < word1Length) {
                output.append(word1.get(i))
            }
            if (i < word2Length) {
                output.append(word2.get(i))
            }
        }
        return output.toString()
    }
}

