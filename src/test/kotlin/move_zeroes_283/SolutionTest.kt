package move_zeroes_283

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SolutionTest {
    val solution = Solution()

    @Test
    fun moveZeroes() {
        val expected = intArrayOf(1, 2, 3, 4, 5, 0, 0, 0)
        val nums = intArrayOf(1, 0, 0, 2, 3, 0, 4, 5)
        solution.moveZeroes(nums)
        assertArrayEquals(expected, nums)
    }
}