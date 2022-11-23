package android.realproject.data.date

import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

object AppDate: TimeImpl {
    private val currentDate = LocalDate.now()
    private val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
    private val period = Period.of(0,0,7)

    override fun getCurrentDate(): String {
        return currentDate.format(formatter)
    }

    override fun getApproximateDate(): MutableList<LocalDate> {

        val date = currentDate.minus(period)
        val res = mutableListOf<LocalDate>()
        for (i in 0 until period.days){
            res.add(date)
            date.plusDays(1)
        }

        return res
    }

    override fun getCurrentDay(): Int = currentDate.dayOfMonth
}