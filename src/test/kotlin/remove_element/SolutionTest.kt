package remove_element

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

    /*nums = [3,2,2,3], val = 3
    Output: 2*/
    @ParameterizedTest
    @MethodSource("testData")
    fun `test remove Element`(nums: IntArray, number: Int, expectedOutput: Int) {
        val actualOutput = solution.removeElement(nums, number)
        Assertions.assertEquals(expectedOutput, actualOutput)
    }

    companion object {
        @JvmStatic
        fun testData(): List<Arguments> {
            return listOf(
                Arguments.of(intArrayOf(3, 2, 2, 3), 3, 2),
                Arguments.of(intArrayOf(0, 1, 2, 2, 3, 0, 4, 2), 2, 5),
                Arguments.of(intArrayOf(3, 2, 2, 3), 3, 2),
            )
        }
    }
}