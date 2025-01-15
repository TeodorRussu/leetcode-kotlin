package candy

class Solution {
    fun candy(ratings: IntArray): Int {
        if (ratings.isEmpty()) {
            return 0
        }
        val candies = mutableListOf<Int>()
        for (i in ratings.indices) {
            candies.add(1)
        }

        val minimumRatingIndex = ratings.indices.minByOrNull { ratings[it] }!!

        // fill candy values from minimum rating index to the beginning
        var previousCandyValue = 0
        var currentRating = 0
        var previousRating = 0
        for (i in minimumRatingIndex downTo 0) {
            if (i == minimumRatingIndex) {
                continue
            }
            previousCandyValue = candies[i + 1]
            currentRating = ratings[i]
            previousRating = ratings[i + 1]

            if (previousRating >= currentRating) {
                candies[i] = 1
            } else {
                candies[i] = previousCandyValue + 1
            }
        }

        // fill candy values from minimum rating index to the end
        for (i in minimumRatingIndex until ratings.size) {
            if (i == minimumRatingIndex) {
                continue
            }
            currentRating = ratings[i]
            previousRating = ratings[i - 1]
            previousCandyValue = candies[i - 1]
            if (previousRating >= currentRating) {
                candies[i] = 1
            } else {
                candies[i] = previousCandyValue + 1
            }
        }
        var currentCandyValue = 0
        // fix edge cases from right to left
        for (i in candies.lastIndex downTo 0) {
            if (i == candies.lastIndex) {
                continue
            }
            previousCandyValue = candies[i + 1]
            currentCandyValue = candies[i]
            currentRating = ratings[i]
            previousRating = ratings[i + 1]
            if (currentRating > previousRating && currentCandyValue <= previousCandyValue) {
                candies[i] = previousCandyValue + 1
            }
        }

        // fix edge cases from left to right
        for (i in candies.indices) {
            if (i == 0) {
                continue
            }
            previousCandyValue = candies[i - 1]
            currentCandyValue = candies[i]
            currentRating = ratings[i]
            previousRating = ratings[i - 1]
            if (currentRating > previousRating && currentCandyValue <= previousCandyValue) {
                candies[i] = previousCandyValue + 1
            }
        }

        return candies.sum()
    }

}

