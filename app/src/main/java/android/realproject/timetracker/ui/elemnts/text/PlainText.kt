package android.realproject.timetracker.ui.elemnts.text

import android.realproject.timetracker.ui.theme.White
import android.realproject.utils.Const
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight

@Composable
fun PlainText(
    text: String,
    modifier: Modifier = Modifier
) =
    Text(
        text = text,
        fontSize = Const.TextSize.NORMAL,
        fontWeight = FontWeight.Bold,
        color = White,
        modifier = modifier,
    )