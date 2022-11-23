package android.realproject.timetracker.ui.elemnts.topbars.elements

import android.realproject.timetracker.R
import android.realproject.timetracker.ui.elemnts.text.DescText
import android.realproject.timetracker.ui.elemnts.text.HighlightText
import android.realproject.utils.Const
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource

@Composable
fun UserInfoTopBar(
    modifier: Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween,
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
            modifier = Modifier.weight(3f).padding(horizontal = Const.Padding.NORMAL),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center
        ) {
            HighlightText(text = "Марьин Тимофей")
            DescText(text = "Ux/UI designer")
        }
    }
}