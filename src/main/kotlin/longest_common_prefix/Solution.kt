package longest_common_prefix

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.size == 1) {
            return strs.first()
        }
        val shortestWord = strs.minByOrNull { it.length }!!

        val commonPrefix = StringBuilder("")
        for (i in shortestWord.indices) {
            for (word in strs) {
                if (word[i] != shortestWord[i])
                    return commonPrefix.toString()
            }
            commonPrefix.append(shortestWord[i])
        }

        return commonPrefix.toString()
    }
}