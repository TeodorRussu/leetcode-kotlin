package majority_element

class Solution {
    fun majorityElement(nums: IntArray): Int {
        var counter = 0
        var candidate = 0
        nums.forEach {
            if (counter == 0) {
                candidate = it
            }
            counter += if (it == candidate) 1 else -1

        }
        return candidate
    }
}