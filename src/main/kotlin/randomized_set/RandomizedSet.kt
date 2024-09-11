package randomized_set

import kotlin.random.Random

class RandomizedSet() {

    private val dataStore = mutableSetOf<Int>()
    private val random = Random


    fun insert(`val`: Int): Boolean {
        if (dataStore.contains(`val`)) {
            return false
        }
        dataStore.add(`val`)
        return true
    }

    fun remove(`val`: Int): Boolean {
        if (dataStore.contains(`val`)) {
            dataStore.remove(`val`)
            return true
        }
        return false

    }

    fun getRandom(): Int {
        val size = dataStore.size
        return dataStore.elementAt(random.nextInt(size))
    }

}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * var obj = RandomizedSet()
 * var param_1 = obj.insert(`val`)
 * var param_2 = obj.remove(`val`)
 * var param_3 = obj.getRandom()
 */