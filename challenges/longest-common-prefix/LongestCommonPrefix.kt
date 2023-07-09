class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var longest = ""
        val str = strs[0]
        
        for (i in 0 until str.length) {
            if (strs.any { it.length == i || it[i] != str[i] }) break
            longest += str[i]
        }

        return longest
    }
}
