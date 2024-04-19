package jump_game_ii

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
    fun jump(input: IntArray, expectedOutput: Int) {
        val actualOutput = solution.jump(input)
        assertEquals(expectedOutput, actualOutput)
    }

    companion object {
        @JvmStatic
        fun testData(): List<Arguments> = listOf(
            Arguments.of(intArrayOf(2, 3, 0, 1, 4), 2),
            Arguments.of(intArrayOf(1), 0),
            Arguments.of(intArrayOf(5,5,5,5,2,4), 1),
            Arguments.of(intArrayOf(1,2), 1),
        )
    }
}