package jump_game

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
    fun testCanJump(nums: IntArray, expectedOutput:Boolean) {
        val actualOutput = solution.canJump(nums)
        assertEquals(expectedOutput, actualOutput)
    }

    companion object {
        @JvmStatic
        fun testData(): List<Arguments> =
            listOf(
                Arguments.of(intArrayOf(2, 3, 1, 1, 4), true),
//                Arguments.of(intArrayOf(3, 2, 1, 0, 4), false),
//                Arguments.of(intArrayOf(3, 5, 0, 0, 4), true),
//                Arguments.of(intArrayOf(3), true),
//                Arguments.of(intArrayOf(0), true),
            )
    }
}