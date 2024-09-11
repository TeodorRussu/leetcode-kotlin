package randomized_set

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class RandomizedSetTest {
    lateinit var randomizedSet: RandomizedSet

    @BeforeEach
    fun setUp() {
        randomizedSet = RandomizedSet()
    }

    @Test
    fun `test new insert should always return true`() {
        assertTrue(randomizedSet.insert(1))
        assertTrue(randomizedSet.insert(2))
        assertTrue(randomizedSet.insert(3))
        assertTrue(randomizedSet.insert(4))

    }

    @Test
    fun `test existing insert should always return false`() {
        randomizedSet.insert(1)
        randomizedSet.insert(2)
        randomizedSet.insert(3)
        assertFalse(randomizedSet.insert(1))
        assertFalse(randomizedSet.insert(2))
        assertFalse(randomizedSet.insert(3))
    }

    @Test
    fun `test removes returns true if value was present`() {
        randomizedSet.insert(1)
        randomizedSet.insert(2)
        randomizedSet.insert(3)
        assertTrue(randomizedSet.remove(1))
        assertTrue(randomizedSet.remove(2))
        assertTrue(randomizedSet.remove(3))
    }

    @Test
    fun `test removes returns false if value was not present`() {
        assertFalse(randomizedSet.remove(1))
        assertFalse(randomizedSet.remove(2))
        assertFalse(randomizedSet.remove(3))
    }

    @Test
    fun `test get random`() {

        randomizedSet.insert(1)
        randomizedSet.insert(2)
        randomizedSet.insert(3)

        val outputs = mutableSetOf<Int>()

        for (i in 0 .. 10)
            outputs.add(randomizedSet.getRandom())

        assertTrue(outputs.contains(1))
        assertTrue(outputs.contains(2))
        assertTrue(outputs.contains(3))
    }
}