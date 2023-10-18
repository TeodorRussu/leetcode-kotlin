package merge_strings_alternately

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class SolutionTest {

    lateinit var solution: Solution

    @BeforeEach
    fun setUp() {
        solution = Solution()
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    fun testMergeAlternately(word1: String, word2: String, expectedOutput: String) {
        val actualOutput = solution.mergeAlternately(word1 = word1, word2 = word2)
        Assertions.assertEquals(expectedOutput, actualOutput)
    }


    companion object {
        @JvmStatic
        fun provideTestData(): List<Arguments> {
            return listOf(
                Arguments.of("abc", "pqr", "apbqcr"),
                Arguments.of("ab", "pqrs", "apbqrs"),
                Arguments.of("abcd", "pq", "apbqcd"),
            )
        }
    }
}