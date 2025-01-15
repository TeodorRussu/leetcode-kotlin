package candy

class Solution {
    fun candy(ratings: IntArray): Int {
        if (ratings.isEmpty()) {
            return 0
        }
        if (ratings.size == 1) {
            return 1
        }
        val candies = mutableListOf<Int>()
        for (i in ratings.indices) {
            candies.add(1)
        }

        for (i in 1 until ratings.size) {
            if (ratings[i] > ratings[i - 1] ) {
                candies[i] = candies[i - 1] + 1
            }
        }

        for (i in ratings.size - 2 downTo 0) {

            if (ratings[i] > ratings[i + 1] && (candies[i] <= candies[i + 1])) {
                candies[i] = candies[i + 1] + 1
            }
        }

        return candies.sum()
    }

}

