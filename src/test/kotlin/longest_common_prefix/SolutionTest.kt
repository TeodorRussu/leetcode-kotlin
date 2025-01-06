package longest_common_prefix

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class SolutionTest {

    lateinit var solution: Solution

    @BeforeEach
    fun setUp() {
        solution = Solution()
    }

    @ParameterizedTest
    @MethodSource("testingData")
    fun longestCommonPrefix(strArray: Array<String>, expectedOutput: String) {
        val actualOutput = solution.longestCommonPrefix(strArray)
        assertEquals(expectedOutput, actualOutput)
    }

    companion object {
        @JvmStatic
        fun testingData() = listOf(
            Arguments.of(arrayOf("aab", "aac", "aawwer", "aa3456"), "aa"),
            Arguments.of(arrayOf("ab", "aac", "aawwer", "aa3456"), "a"),
            Arguments.of(arrayOf("a", "aac", "aawwer", "aa3456"), "a"),
            Arguments.of(arrayOf("a"), "a"),
            Arguments.of(arrayOf("abcd"), "abcd"),
            Arguments.of(arrayOf("dog","racecar","car"), ""),
        )
    }
}