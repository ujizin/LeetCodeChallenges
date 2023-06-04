class Solution {
    fun isPalindrome(head: ListNode?): Boolean {
        var lastNode = head
        val list = mutableListOf<Int>()
        while(lastNode != null) {
            list += lastNode.`val`
            lastNode = lastNode.next
        }

        return list == list.reversed() 
    }
}