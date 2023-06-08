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
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?, carry: Int = 0): ListNode? {
        if (l1 == null && l2 == null && carry == 0) return null
        val value = (l1?.`val` ?: 0) + (l2?.`val` ?: 0) + carry
        return ListNode(value % 10).apply {
             next = addTwoNumbers(l1?.next, l2?.next, value / 10)
        }
    }
}