package android.realproject.timetracker.ui.elemnts.topbars.elements

import android.realproject.timetracker.ui.theme.White
import android.realproject.utils.Const
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


@Composable
fun ControlsTopBar(
    modifier: Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Default.Search,
            contentDescription = null,
            tint = White
        )
        Icon(
            imageVector = Icons.Default.Notifications,
            contentDescription = null,
            tint = White,
            modifier = Modifier.padding(start = Const.Padding.NORMAL)
        )
    }
}