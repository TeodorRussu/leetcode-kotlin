package remove_duplicates_from_forted_array_ii

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import `remove_duplicates_from_forted_array_ii `.Solution

class SolutionTest {

    lateinit var solution: Solution

    @BeforeEach
    fun setUp() {
        solution = Solution()
    }

    @ParameterizedTest
    @MethodSource("testingData")
    fun removeDuplicates(input: IntArray, expectedOutput: IntArray, expectedOutputLength: Int) {
        val actualOutputLength = solution.removeDuplicates(input)
        Assertions.assertEquals(expectedOutputLength, actualOutputLength)
        for (i in 0 until expectedOutputLength) {
            Assertions.assertEquals(expectedOutput[i], input[i])
        }
    }

    companion object {
        @JvmStatic
        fun testingData(): List<Arguments> =
            listOf(
                Arguments.of(intArrayOf(1, 1, 1, 2, 2, 3), intArrayOf(1, 1, 2, 2, 3), 5),
                Arguments.of(intArrayOf(0, 0, 1, 1, 1, 1, 2, 3, 3), intArrayOf(0, 0, 1, 1, 2, 3, 3), 7)
            )
    }
}