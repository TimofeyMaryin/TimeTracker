package android.realproject.timetracker.ui.elemnts.for_info_about_day.date_elements.element

import android.realproject.data.date.AppDate
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun RowDateList(
    appDate: AppDate,
    modifier: Modifier
) {
    LazyRow(
        modifier = Modifier.fillMaxWidth().then(modifier)
    ) {
        items(appDate.getApproximateDate().size) {
            DateListItem(
                day = appDate.getApproximateDate()[it].dayOfMonth.toString(),
                week = appDate.getApproximateDate()[it].dayOfWeek.toString()
            )
        }
    }
}