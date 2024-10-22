package product_of_array_except_self

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
    fun productExceptSelf(input: IntArray, expectedOutput: IntArray) {
        val actualOutout = solution.productExceptSelf(input)
        assertArrayEquals(expectedOutput, actualOutout)
    }

    companion object {
        @JvmStatic
        fun testData(): List<Arguments> = listOf(
            Arguments.of(intArrayOf(1, 2, 3, 4), intArrayOf(24, 12, 8, 6)),
            Arguments.of(intArrayOf(1, 2, 3, 4, 0), intArrayOf(0, 0, 0, 0, 24)),
            Arguments.of(intArrayOf(1, 2, 3, 4, 0, 0), intArrayOf(0, 0, 0, 0, 0, 0)),
            Arguments.of(intArrayOf(), intArrayOf()),
            )
    }

}