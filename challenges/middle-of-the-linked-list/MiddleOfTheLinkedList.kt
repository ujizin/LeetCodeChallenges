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

    /***
        First solution...

        var node = head
        var count = 0
        while(node != null) {
            node = node?.next
            count++
        }
        val middle = (count / 2) + 1
        node = head
        for (num in 1 until middle) { node = node?.next }
        return node
    
     */
    fun middleNode(head: ListNode?): ListNode? {
        var slow = head
        var fast = head

        while(slow?.next != null && fast?.next != null) {
            fast = fast?.next?.next
            slow = slow?.next
        }

        return slow
    }
}