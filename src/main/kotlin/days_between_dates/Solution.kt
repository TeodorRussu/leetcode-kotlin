package days_between_dates

import java.time.LocalDate
import java.time.temporal.ChronoUnit

class Solution {
    fun daysBetweenDates(date1: String, date2: String): Int {
        val dateOne = LocalDate.parse(date1)
        val dateTwo = LocalDate.parse(date2)

        val difference = Math.abs(ChronoUnit.DAYS.between(dateOne, dateTwo))
        return difference.toInt()
    }
}