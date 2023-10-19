package remove_element

class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        val list = arrayListOf<Int>()

        for (i in nums) {
            if (i != `val`) {
                list.add(i)
            }
        }

        for (i in list.indices) {
            nums[i] = list.get(i)
        }
        return list.size
    }
}