package gas_station

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
    fun canCompleteCircuit(gas: IntArray, cost: IntArray, expectedOutput: Int) {
        val actualOutput = solution.canCompleteCircuit(gas, cost)
        assertEquals(expectedOutput, actualOutput)
    }

    companion object {
        @JvmStatic
        fun testData(): List<Arguments> {
            return listOf(
                Arguments.of(intArrayOf(5), intArrayOf(4), 0),
                Arguments.of(intArrayOf(1, 2, 3, 4, 5), intArrayOf(3, 4, 5, 1, 2), 3),
                Arguments.of(intArrayOf(2, 3, 4), intArrayOf(3, 4, 3), -1),)
        }
    }
}
