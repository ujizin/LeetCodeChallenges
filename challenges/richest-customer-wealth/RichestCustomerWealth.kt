class Solution {
    fun maximumWealth(a: Array<IntArray>) = a.maxBy { it.sum() }!!.sum()
}