class Solution {
    fun numberOfSteps(num: Int): Int {
        var step = 0
        var n = num
        while (n != 0) {
            if (n % 2 == 1) n -= 1 else n /= 2
            step++
        }

        return step
    }
}