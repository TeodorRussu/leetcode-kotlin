package reverse_words_in_sentence

import java.util.regex.Pattern

class Solution {
    fun reverseWords(s: String): String {
        return s.split(regex = Pattern.compile("\\s+"))
            .reversed()
            .joinToString(separator = " ")
            .trim()
    }
}