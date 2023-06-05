class Solution {
    fun fizzBuzz(n: Int): List<String> {
        val list = mutableListOf<String>()
        for (num in 1 .. n) {
            list += when {
                num % 3 == 0 && num % 5 == 0 -> "FizzBuzz"
                num % 3 == 0 -> "Fizz"
                num % 5 == 0 -> "Buzz"
                else -> "$num"
            }
        }
        return list
    }
}