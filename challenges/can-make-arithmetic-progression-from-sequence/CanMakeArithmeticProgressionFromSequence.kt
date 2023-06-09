class Solution {
    fun canMakeArithmeticProgression(arr: IntArray): Boolean {
        arr.sort()
        val progress = arr[1] - arr[0]
        for(i in 1 until arr.size) {
            if (arr[i] - progress != arr[i - 1]) return false
        }
        return true
    }
}