class Solution {
    fun findFinalValue(nums: IntArray, original: Int): Int {
        val value = nums.firstOrNull { it == original }
        if (value == null) return original
        return findFinalValue(nums, value * 2)
    }
}