class Solution {
    /***
     * First Solution
     * fun twoSum(nums: IntArray, target: Int): IntArray {
     *     nums.forEachIndexed { ia, a ->
     *         nums.forEachIndexed { ib, b ->
     *             if (ia != ib && a + b == target) {
     *                 return intArrayOf(ia, ib)
     *             }
     *         }
     *     }
     *     return intArrayOf()
     * }
     *  
     * */
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        
        for ((index, value) in nums.withIndex()) {            
            val diff = target - value

            map[diff]?.let {
                return@twoSum intArrayOf(it, index)
            }

            map[value] = index
        }

        return intArrayOf()
    }
}