package length_of_last_word

import org.junit.jupiter.api.Assertions
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
    @MethodSource("testingDataProvider")
    fun lengthOfLastWord(text: String, expectedOutput: Int) {
        val actualOutput = solution.lengthOfLastWord(text)
        Assertions.assertEquals(expectedOutput, actualOutput)
    }

    companion object {
        @JvmStatic
        fun testingDataProvider(): List<Arguments> =
            listOf(
                Arguments.of("Hello World", 5),
                Arguments.of("   fly me   to   the moon  ", 4),
                Arguments.of("luffy is still joyboy", 6),
            )
    }
}