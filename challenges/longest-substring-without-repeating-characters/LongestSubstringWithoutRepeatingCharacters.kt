class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var count = 0
        var longest = 0
        var chars = mutableListOf<Char>()
        s.toCharArray().forEach {
            if (chars.contains(it)) {
                val new = chars.drop(chars.indexOf(it) + 1)
                chars.clear()
                chars.addAll(new)
                chars.add(it)
                count = chars.size
            } else {
                chars.add(it)
                count++
            }

            if (count > longest) {
                longest = count
            }
        }

        return longest
    }
}