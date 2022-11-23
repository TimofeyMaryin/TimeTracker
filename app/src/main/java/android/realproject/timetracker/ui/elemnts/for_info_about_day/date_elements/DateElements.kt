package android.realproject.timetracker.ui.elemnts.for_info_about_day.date_elements

import android.realproject.data.date.AppDate
import android.realproject.timetracker.ui.elemnts.for_info_about_day.date_elements.element.RowDateList
import android.realproject.timetracker.ui.elemnts.text.LargeText
import android.realproject.utils.Const
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun DateElements(
    appDate: AppDate,
    modifier: Modifier
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .then(modifier),
        horizontalAlignment = Alignment.Start,
    ) {
        LargeText(
            text = appDate.getCurrentDate(),
            modifier = Modifier.padding(horizontal = Const.Padding.LARGE),
            fontSize = 22.sp
        )
        RowDateList(
            appDate = appDate,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = Const.Padding.LARGE)
        )
    }
}