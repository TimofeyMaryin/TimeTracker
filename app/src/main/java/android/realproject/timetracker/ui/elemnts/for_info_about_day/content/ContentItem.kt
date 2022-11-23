package android.realproject.timetracker.ui.elemnts.for_info_about_day.content

import android.realproject.timetracker.R
import android.realproject.timetracker.ui.elemnts.text.PlainText
import android.realproject.timetracker.ui.elemnts.text.SmallText
import android.realproject.timetracker.ui.theme.SecondaryPink
import android.realproject.utils.Const
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ContentItem(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = Const.Padding.NORMAL, horizontal = Const.Padding.LARGE)
            .then(modifier),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = null,
            modifier = Modifier
                .clip(CircleShape)
                .weight(1f)
        )
        Column(
            modifier = Modifier.weight(7f).padding(horizontal = Const.Padding.NORMAL)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                PlainText(text = "Exampple",)
                SmallText(text = "Small Example")
            }
            LinearProgressIndicator(
                modifier = Modifier.height(30.dp).clip(Const.RoundedCorner.NORMAL).fillMaxWidth(),
                backgroundColor = Color.Gray,
                color = SecondaryPink
            )
        }

    }
}