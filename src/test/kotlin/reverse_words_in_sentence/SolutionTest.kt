package reverse_words_in_sentence

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.regex.Pattern

class SolutionTest {

    lateinit var solution: Solution

    @BeforeEach
    fun setUp() {
        solution = Solution()
    }

    @ParameterizedTest
    @MethodSource("testingDataProvider")
    fun reverseWords(input: String, expectedOutput: String) {
        val actualOutput = solution.reverseWords(input)
        assertEquals(expectedOutput, actualOutput)
    }

    companion object {
        @JvmStatic
        fun testingDataProvider() = listOf(
            Arguments.of("the sky is blue", "blue is sky the"),
            Arguments.of("   the    sky  is blue         \t", "blue is sky the"),
            Arguments.of("o", "o"),
            Arguments.of("   o ", "o"),
            Arguments.of("   o ", "o"),
        )
    }
}