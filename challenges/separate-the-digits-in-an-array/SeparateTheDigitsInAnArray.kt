class Solution {
    fun separateDigits(n: IntArray) = n.joinToString("").map { it-'0' }
}