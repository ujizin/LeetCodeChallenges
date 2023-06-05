class Solution {
    fun kWeakestRows(m: Array<IntArray>, k: Int) = m.withIndex()
        .sortedBy { it.value.sum() }
        .take(k)
        .map { it.index }
        .toIntArray()
}