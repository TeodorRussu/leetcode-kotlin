package bets_tyme_to_buy_and_sell_stock_2

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
    fun maxProfit(input: IntArray, expectedOutput: Int) {
        val actualOutput = solution.maxProfit(input)
        assertEquals(expectedOutput, actualOutput)
    }

    companion object {
        @JvmStatic
        fun testData(): List<Arguments> =
            listOf(
                Arguments.of(intArrayOf(7,1,5,3,6,4), 7),
                Arguments.of(intArrayOf(1, 1), 0),
                Arguments.of(intArrayOf(1, 2, 3, 4, 5), 4),
                Arguments.of(intArrayOf(7, 6, 4, 3, 1), 0),
                Arguments.of(intArrayOf(), 0),
                Arguments.of(intArrayOf(1, 2, 3, 4, 5, 2, 5), 7),
            )
    }
}