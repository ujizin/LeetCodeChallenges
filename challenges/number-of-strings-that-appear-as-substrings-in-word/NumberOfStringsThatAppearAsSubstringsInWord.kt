class Solution {
    fun numOfStrings(patterns: Array<String>, word: String) = patterns.count { word.contains(it) }
}
