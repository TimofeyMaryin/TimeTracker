package android.realproject.timetracker.ui.elemnts.text

import android.realproject.timetracker.ui.theme.White
import android.realproject.utils.Const
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.TextUnit

@Composable
fun LargeText(
    text: String,
    modifier: Modifier = Modifier,
    fontSize: TextUnit = Const.TextSize.LARGE
) =
    Text(
        text = text,
        fontSize = fontSize,
        color = White,
        modifier = modifier
    )