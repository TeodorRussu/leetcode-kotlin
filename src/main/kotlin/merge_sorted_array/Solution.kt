package merge_sorted_array

class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var currentIndexNums1 = 0
        var currentIndexNums2 = 0
        var currentIndexMergedNums = 0
        val nums1Copy = nums1.clone()

        while (currentIndexNums1 < m || currentIndexNums2 < n) {
            if (currentIndexNums1 == m && currentIndexNums2 == n) {
                break;
            } else if (currentIndexNums1 < m && currentIndexNums2 == n) {
                nums1[currentIndexMergedNums] = nums1Copy[currentIndexNums1]
                currentIndexNums1++
                currentIndexMergedNums++
            } else if (currentIndexNums1 == m && currentIndexNums2 < n) {
                nums1[currentIndexMergedNums] = nums2[currentIndexNums2]
                currentIndexNums2++
                currentIndexMergedNums++
            } else if (currentIndexNums1 < m && nums1Copy[currentIndexNums1] < nums2[currentIndexNums2]) {
                nums1[currentIndexMergedNums] = nums1Copy[currentIndexNums1]
                currentIndexNums1++
                currentIndexMergedNums++
            } else {
                nums1[currentIndexMergedNums] = nums2[currentIndexNums2]
                currentIndexNums2++
                currentIndexMergedNums++
            }
        }
    }
}