package best_time_to_buy_and_sell_stock

class Solution {
    fun maxProfit(prices: IntArray): Int {

        var minimum = prices[0]
        var maxRange = 0

        var indexContinue = 0

        for (i in prices.indices) {
            val currentValue = prices[i]
            if (currentValue < minimum) {
                minimum = currentValue
            }
            if (prices[i] > minimum) {
                maxRange = prices[i] - minimum
                indexContinue = i + 1
                break
            }
        }
        if (maxRange == 0) {
            return 0
        }

        for (i in indexContinue..<prices.size) {
            if (prices[i] < minimum) {
                minimum = prices[i]
            } else if (prices[i] - minimum > maxRange) {
                maxRange = prices[i] - minimum
            }
        }
        return maxRange

    }
}

