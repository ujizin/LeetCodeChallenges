class Solution {
    fun maxProfit(prices: IntArray): Int {
        var smallestNumber = prices.first()
        var maxValue = 0
        prices.forEach {
            if (it < smallestNumber) smallestNumber = it
            if (it - smallestNumber > maxValue) maxValue = it - smallestNumber 
        }

        return maxValue
    }
}