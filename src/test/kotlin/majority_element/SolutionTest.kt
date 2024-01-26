package majority_element

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
    @MethodSource("getTestingData")
    fun majorityElement(input: IntArray, expectedOutput: Int) {
        val actualOutput = solution.majorityElement(input)
        assertEquals(expectedOutput, actualOutput)
    }

    companion object {
        @JvmStatic
        fun getTestingData(): List<Arguments> = listOf(
            Arguments.of(intArrayOf(3, 2, 3), 3),
            Arguments.of(intArrayOf(2, 2, 1, 1, 1, 2, 2), 2),
        )
    }
}