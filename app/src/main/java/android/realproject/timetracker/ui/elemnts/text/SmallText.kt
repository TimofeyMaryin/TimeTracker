package android.realproject.timetracker.ui.elemnts.text

import android.realproject.utils.Const
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun SmallText(
    text: String,
    modifier: Modifier = Modifier
) =
    Text(
        text = text,
        fontSize = Const.TextSize.SMALL,
        color = Color.Gray,
        modifier = modifier
    )