class Solution {
    fun singleNumber(nums: IntArray): Int {
        var n = 0
        nums.forEach {
            n = n.xor(it)
        }
        return n
    }
}