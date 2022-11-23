package android.realproject.timetracker.ui.elemnts.text

import android.realproject.timetracker.ui.theme.White
import android.realproject.utils.Const
import android.text.BoringLayout
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight

@Composable
fun HighlightText(text: String) =
    Text(
        text = text,
        fontWeight = FontWeight.Bold,
        fontSize =Const.TextSize.LARGE,
        color = White
    )