class Solution {
    fun isValid(s: String): Boolean {
        if (s == "") return true        
        val replaced = s.replace("{}", "").replace("[]", "").replace("()", "")
        if (replaced == s) return false
        return isValid(replaced)
    }
}