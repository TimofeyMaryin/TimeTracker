package android.realproject.timetracker.ui.elemnts.for_info_about_day.date_elements.element

import android.realproject.timetracker.ui.elemnts.text.DescText
import android.realproject.timetracker.ui.elemnts.text.LargeText
import android.realproject.timetracker.ui.elemnts.text.PlainText
import android.realproject.timetracker.ui.elemnts.text.SmallText
import android.realproject.timetracker.ui.theme.LightBg
import android.realproject.utils.Const
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@Composable
fun DateListItem(
    day: String,
    week: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier
            .clip(CircleShape)
            .padding(horizontal = Const.Padding.LARGE)
            .background(LightBg)
            .height(120.dp)
            .width(60.dp)
            .then(modifier),
        contentAlignment = Alignment.Center
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            PlainText(text = day)
            SmallText(text = week)
        }
    }
}