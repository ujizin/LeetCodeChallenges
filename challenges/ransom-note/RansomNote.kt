/***
 * What I've learned:
 * 1. List.toCharArray() is more performatic than split("")
 * 2. List.remove returns boolean, it's better use this than indexOf or include to check value.
 */
class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val magazineLetters = magazine.toCharArray().toMutableList()
        ransomNote.toCharArray().forEach { 
            if (!magazineLetters.remove(it)) {
                return false
            }            
        }
        return true
    }
}