package android.realproject.data.view_model

import android.realproject.data.date.AppDate
import androidx.lifecycle.ViewModel

class InfoAboutDayViewModel: ViewModel() {
    private val date = AppDate
    val currentDay = date.getCurrentDay()
    val approximateDays = date.getApproximateDate()


}