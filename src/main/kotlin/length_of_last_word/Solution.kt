package length_of_last_word

class Solution {
    fun lengthOfLastWord(text: String): Int {
        var length: Int = 0
        for (index in text.lastIndex downTo 0) {
            val currentCharcater = text[index]
            val isenglishCharacter = isEnglishCharacter(currentCharcater)
            if (isenglishCharacter) {
                length++
            } else if (length > 0) {
                return length
            }
        }
        return length
    }

    private fun isEnglishCharacter(charcater: Char): Boolean {
        return ((charcater >= 'A' && charcater <= 'Z') || (charcater >= 'a' && charcater <= 'z'))
    }
}