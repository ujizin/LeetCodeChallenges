class Solution {
    fun isPalindrome(s: String): Boolean {
        val sentence = s.replace(Regex("[^A-Za-z0-9]"), "").toLowerCase()
        return sentence == sentence.reversed()
    }
}