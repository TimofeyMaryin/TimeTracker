package android.realproject.timetracker.ui.elemnts.for_info_about_day.content

import android.realproject.timetracker.ui.elemnts.text.LargeText
import android.realproject.timetracker.ui.theme.DarkBg
import android.realproject.timetracker.ui.theme.White
import android.realproject.utils.Const
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@Composable
fun ContentAboutDay(
    modifier: Modifier
) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp))
            .fillMaxWidth()
            .padding(top = Const.Padding.NORMAL, start = Const.Padding.NORMAL, end = Const.Padding.NORMAL)
            .background(DarkBg)
            .then(modifier),
        contentAlignment = Alignment.TopCenter
        ) {
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            item {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(Const.Padding.LARGE),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                )   {
                    LargeText(text = "Categories")
                    Icon(
                        imageVector = Icons.Default.MoreVert,
                        contentDescription = null,
                        tint = White
                    )
                }

            }
            items(10) {
                ContentItem()
            }
        }

    }
}