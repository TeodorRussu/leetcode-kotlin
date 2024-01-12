package merge_sorted_array

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions
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

    @ParameterizedTest
    @MethodSource("provideTestData")
    fun `test all cases`(nums1:IntArray, m:Int, nums2:IntArray, n:Int, expected:IntArray){
        solution.merge(nums1, m, nums2, n)
        Assertions.assertArrayEquals(expected, nums1)
    }

    companion object {
        @JvmStatic
        fun provideTestData():List<Arguments> = listOf(
            Arguments.of(intArrayOf(1,2,3,0,0,0), 3, intArrayOf(2,5,6), 3, intArrayOf(1,2,2,3,5,6)),
            Arguments.of(intArrayOf(1), 1, intArrayOf(), 0, intArrayOf(1)),
            Arguments.of(intArrayOf(0), 0, intArrayOf(1), 1, intArrayOf(1))
        )
    }
}