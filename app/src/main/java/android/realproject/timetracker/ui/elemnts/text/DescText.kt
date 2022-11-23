package android.realproject.timetracker.ui.elemnts.text

import android.realproject.timetracker.ui.theme.White
import android.realproject.utils.Const
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight

@Composable
fun DescText(text: String) =
    Text(
        text = text,
        fontSize = Const.TextSize.SMALL,
        color = White,
        fontWeight = FontWeight.Normal
    )