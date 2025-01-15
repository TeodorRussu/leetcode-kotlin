package candy

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
    @MethodSource("testData")
    fun candy(input: IntArray, expectedOutput: Int) {
        val actualOutput = solution.candy(input)
        assertEquals(expectedOutput, actualOutput)
    }

    companion object {
        @JvmStatic
        fun testData(): List<Arguments> {
            return listOf(
                Arguments.of(intArrayOf(1, 0, 2), 5),
                Arguments.of(intArrayOf(1, 2, 2), 4),
                Arguments.of(intArrayOf(1, 2, 2, 2, 3, 2), 8),
                Arguments.of(intArrayOf(1, 1, 1, 1, 1), 5),
                Arguments.of(intArrayOf(), 0),
                Arguments.of(intArrayOf(1, 3, 2, 2, 1), 7),
                Arguments.of(intArrayOf(1,2,87,87,87,2,1), 13),
            )
        }
    }
}