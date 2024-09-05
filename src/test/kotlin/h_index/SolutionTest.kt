package h_index

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
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
    fun `test h-index implementation`(input: IntArray, expected: Int) {
        assertEquals(expected, solution.hIndex(input))
    }

    companion object {
        @JvmStatic
        fun testData(): List<Arguments> = listOf(
            Arguments.of(intArrayOf(3, 0, 6, 1, 5), 3),
            Arguments.of(intArrayOf(1, 3, 1), 1),
            Arguments.of(intArrayOf(100), 1),
            Arguments.of(intArrayOf(100, 65), 2),
            Arguments.of(intArrayOf(4,4,0,0), 2),
            Arguments.of(intArrayOf(100, 65, 0, 0), 2),
            Arguments.of(intArrayOf(0), 0),
            Arguments.of(intArrayOf(0,0,0), 0),
            Arguments.of(intArrayOf(3,3,1,1), 2),

        )
    }

}