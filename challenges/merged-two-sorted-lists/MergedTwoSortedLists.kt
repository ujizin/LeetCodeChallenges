/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null || list2 == null) return list1 ?: list2
        val (node, next2) = when {
            list1?.`val` ?: 0 < list2?.`val` ?: 0 -> list1 to list2
            else -> list2 to list1
        }

        return node.apply { next = mergeTwoLists(next, next2) }
    }
}