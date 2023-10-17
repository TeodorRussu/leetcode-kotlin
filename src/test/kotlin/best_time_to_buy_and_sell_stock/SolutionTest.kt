package best_time_to_buy_and_sell_stock

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

    companion object {
        @JvmStatic
        fun provideTestData(): List<Arguments> {
            return listOf(
                Arguments.of(intArrayOf(7, 1, 5, 3, 6, 4), 5),
                Arguments.of(intArrayOf(7, 6, 4, 3, 1), 0),
                Arguments.of(intArrayOf(3, 3, 5, 0, 0, 3, 1, 4), 4)
            )

        }
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    fun testMaxProfit(input: IntArray, expectedOutput: Int) {
        val actualOutput = solution.maxProfit(input)
        Assertions.assertEquals(expectedOutput, actualOutput)
    }
}