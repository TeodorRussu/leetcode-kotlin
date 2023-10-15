package fraction_to_recurring_decimal

class Solution {

    fun fractionToDecimal(numerator: Int, denominator: Int): String {
        if (numerator == 0) {
            return "0"
        }
        if (denominator == 1) {
            return numerator.toString()
        }

        val shouldResultBeNegative: Boolean = (numerator < 0) xor (denominator < 0)

        //convert numbers to Long to handle min and max integer values efficiently
        val divisor: Long = denominator.toLong()
        val numeratorLong: Long = numerator.toLong()

        var rests = ArrayList<Any>()
        var results = ArrayList<Any>()

        // calculate the integer part of the final result
        var result = numeratorLong / divisor
        var rest = numeratorLong % divisor
        rests.add(rest)
        results.add(Math.abs(result))

        // in case the result is not decimal, build and return the final result
        if (rest == 0L) {
            addMinusSignIfRequiredToTheFinalResult(shouldResultBeNegative, results)
            return results.joinToString("")
        }

        buildDecimalPArtOfTheFinalResult(rest, result, divisor, results, rests)

        addDecimalDelimiterToTheFinalResult(results)
        addMinusSignIfRequiredToTheFinalResult(shouldResultBeNegative, results)

        return results.joinToString("")
    }

    private fun buildDecimalPArtOfTheFinalResult(
        rest: Long,
        result: Long,
        divisor: Long,
        results: ArrayList<Any>,
        rests: ArrayList<Any>
    ) {
        var rest1 = rest
        var result1 = result
        while (true) {
            val dividend = rest1 * 10
            result1 = dividend / divisor
            rest1 = dividend % divisor
            results.add(Math.abs(result1))

            if (rest1 == 0L) {
                break
            }

            if (rests.contains(rest1)) {
                val recuringFractionPositionStart = rests.indexOf(rest1)
                wrapRecurringDecimalsWithParanthesis(results, recuringFractionPositionStart)
                break
            }
            rests.add(rest1)
        }
    }

    private fun addDecimalDelimiterToTheFinalResult(results: ArrayList<Any>) {
        results.add(1, ".")
    }

    private fun wrapRecurringDecimalsWithParanthesis(results: ArrayList<Any>, recuringFractionPositionStart: Int) {
        results.add(recuringFractionPositionStart + 1, "(")
        results.add(")")
    }

    private fun addMinusSignIfRequiredToTheFinalResult(shouldResultBeNegative: Boolean, results: ArrayList<Any>) {
        if (shouldResultBeNegative) {
            results.add(0, "-")
        }
    }
}
