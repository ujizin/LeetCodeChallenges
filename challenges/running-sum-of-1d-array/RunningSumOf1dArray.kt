class Solution {
    fun runningSum(n: IntArray) = n.apply {
        forEachIndexed { i, _ -> if(i != 0) n[i] += n[(i - 1)] }
    }
}