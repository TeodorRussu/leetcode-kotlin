package fraction_to_recurring_decimal

import org.junit.jupiter.api.BeforeEach

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class SolutionTest {

    lateinit var solution: Solution

    @BeforeEach
    fun setUp() {
        solution = Solution()
    }

    @Test
    fun `test fraction between -2147483648 and 1`() {
        val expectedOutput = "-2147483648"
        val actualOutput = solution.fractionToDecimal(numerator = -2147483648, denominator = 1)
        assertEquals(expectedOutput, actualOutput)
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    fun `test all cases`(numerator: Int, denominator: Int, expectedOutput: String) {
        val actualOutput = solution.fractionToDecimal(numerator = numerator, denominator = denominator)
        assertEquals(expectedOutput, actualOutput)
    }

    companion object {
        @JvmStatic
        fun provideTestData(): List<Arguments> {
            return listOf(
                Arguments.of(1, 2, "0.5"),
                Arguments.of(0, -5, "0"),
                Arguments.of(2, 1, "2"),
                Arguments.of(4, 333, "0.(012)"),
                Arguments.of(-50, 8, "-6.25"),
                Arguments.of(7, -12, "-0.58(3)"),
                Arguments.of(7, -12, "-0.58(3)"),
                Arguments.of(-1, -2147483648, "0.0000000004656612873077392578125"),
                Arguments.of(-2147483648, 1, "-2147483648"),
            )
        }
    }

}