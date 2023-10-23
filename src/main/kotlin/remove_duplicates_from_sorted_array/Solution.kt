package remove_duplicates_from_sorted_array

import java.util.TreeSet

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        val set = TreeSet<Int>();
        for (i in nums) {
            set.add(i)
        }
        val size = set.size
        for (i in 0..<size) {
            nums[i] = set.pollFirst()
        }

        return size
    }
}