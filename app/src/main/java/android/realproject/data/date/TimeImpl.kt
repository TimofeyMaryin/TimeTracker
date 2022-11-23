package android.realproject.data.date

import java.time.LocalDate

interface TimeImpl {
    fun getCurrentDate(): String
    fun getApproximateDate(): MutableList<LocalDate>
    fun getCurrentDay(): Int
}