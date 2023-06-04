class Solution {
    fun romanToInt(s: String): Int {
        var result = 0
        var previousRoman = ""
        
        s.split("").forEach {            
            result += romanNumber(it)
            result += when(it) {
                "V", "X" -> if (previousRoman == "I") -2 else 0
                "L", "C" -> if (previousRoman == "X") -20 else 0
                "D", "M" -> if (previousRoman == "C") -200 else 0
                else -> 0
            }
            previousRoman = it
        }

        return result
    }

    fun romanNumber(letter: String) = when(letter) {
        "I" -> 1
        "V" -> 5
        "X" -> 10
        "L" -> 50
        "C" -> 100
        "D" -> 500
        "M" -> 1000
        else -> 0
    }
}