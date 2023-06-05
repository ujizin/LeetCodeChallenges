class Solution {

    // Time: O(1)
    // fun isPowerOfTwo(n: Int): Boolean {
    //     if (n <= 0) return false
    //     return (n and (n - 1) == 0)
    // }

    fun isPowerOfTwo(n: Int): Boolean {
        if (n == 0 || n <= 0) return false
        var value = n
        while (value != 1) {
            if (value % 2 != 0) return false
            value = value / 2
        }

        return true
    }
}