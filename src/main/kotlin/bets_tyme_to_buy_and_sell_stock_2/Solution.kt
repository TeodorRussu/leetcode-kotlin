package bets_tyme_to_buy_and_sell_stock_2

class Solution {
    fun maxProfit(prices: IntArray): Int {
        if (prices.isEmpty())
            return 0
        var profit = 0

        var currentPair = LowAndPeak(prices[0], prices[0])

        for (i in 1..<prices.size) {
            val price = prices[i]
            if (currentPair.low!! < price && currentPair.peak!! < price) {
                currentPair.peak = price
            } else if (currentPair.peak!! > price) {
                profit += currentPair.calculateProfit()
                currentPair = LowAndPeak(low = price, peak = price)
            }
        }
        return profit + currentPair.calculateProfit()
    }
}

data class LowAndPeak(var low: Int? = null, var peak: Int? = null) {
    fun calculateProfit(): Int = peak!! - low!!
}
