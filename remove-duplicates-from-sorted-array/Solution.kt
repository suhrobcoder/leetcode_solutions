// https://leetcode.com/problems/remove-duplicates-from-sorted-array

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var i = 0
        for (j in 1 until nums.size) {
            if (nums[j] != nums[i]) {
                i++
                nums[i] = nums[j]
            }
        }
        return i + 1
    }
}