class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        val n = x.toString()
        return n == n.reversed()
    }
}