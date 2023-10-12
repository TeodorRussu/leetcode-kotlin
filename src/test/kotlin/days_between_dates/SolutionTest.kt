package days_between_dates

import org.junit.jupiter.api.*

class SolutionTest {

    lateinit var solution: Solution

    @BeforeEach
    fun setUp() {
        solution = Solution()
    }

    @Test
    fun `test same dates`() {
        val expectedOutput = 0
        val actualOutput = solution.daysBetweenDates(date1= "2019-06-29", date2= "2019-06-29")

        Assertions.assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun `test maximum allowed interval`() {
        val expectedOutput = 47481
        val actualOutput = solution.daysBetweenDates(date1= "1971-01-01", date2= "2100-12-31")

        Assertions.assertEquals(expectedOutput, actualOutput)
    }

     @Test
    fun `test days consecutive dates`() {
        val expectedOutput = 1
        val actualOutput = solution.daysBetweenDates(date1 = "2019-06-29", date2 = "2019-06-30")

        Assertions.assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun `test days between descendent dates`() {
        val expectedOutput = 15
        val actualOutput = solution.daysBetweenDates(date1 = "2020-01-15", date2 = "2019-12-31")

        Assertions.assertEquals(expectedOutput, actualOutput)
    }

}