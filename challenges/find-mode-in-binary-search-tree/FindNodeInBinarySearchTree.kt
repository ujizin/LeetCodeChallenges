/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    val hash = hashMapOf<Int, Int>()

    fun extractValues(node: TreeNode?) {
        node ?: return
        hash[node.`val`] = hash.getOrDefault(node.`val`, 0) + 1
        extractValues(node.left)
        extractValues(node.right)
    }

    fun findMode(root: TreeNode?): IntArray {
        root ?: return intArrayOf()
        hash[root.`val`] = 1
        extractValues(root.left)
        extractValues(root.right)
        val max = hash.values.max()
        return hash.entries.filter { it.value == max }.map { it.key }.toIntArray()
    }
}
