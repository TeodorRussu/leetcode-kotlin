package remove_duplicates_from_sorted_array

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach

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
    fun testFuntion(input: IntArray, expectedOutput: Int){
        var actualOutput = solution.removeDuplicates(input)
        Assertions.assertEquals(expectedOutput, actualOutput)
    }


    companion object{
        @JvmStatic
        fun testData():List<Arguments> = listOf(
            Arguments.of(intArrayOf(1,1,2), 2),
            Arguments.of(intArrayOf(0,0,1,1,1,2,2,3,3,4), 5)
        )
    }
}