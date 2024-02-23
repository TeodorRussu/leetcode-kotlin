package rotate_array

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
    @MethodSource("testingData")
    fun rotate(input: IntArray, steps: Int, expectedOutput: IntArray) {
        solution.rotate(input, steps)
        Assertions.assertArrayEquals(expectedOutput, input)
    }

    companion object {
        @JvmStatic
        fun testingData(): List<Arguments> {
            return listOf(
                Arguments.of(intArrayOf(1, 2, 3, 4, 5, 6, 7), 3, intArrayOf(5, 6, 7, 1, 2, 3, 4)),
                Arguments.of(intArrayOf(-1, -100, 3, 99), 2, intArrayOf(3, 99, -1, -100)),
                Arguments.of(intArrayOf(1), 0, intArrayOf(1)),
                Arguments.of(intArrayOf(1), 2, intArrayOf(1)),
                Arguments.of(intArrayOf(1,2), 3, intArrayOf(2,1)),
            )
        }
    }

}