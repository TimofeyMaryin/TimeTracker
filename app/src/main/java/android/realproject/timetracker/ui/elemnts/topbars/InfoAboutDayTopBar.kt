package android.realproject.timetracker.ui.elemnts.topbars

import android.realproject.timetracker.ui.elemnts.topbars.elements.ControlsTopBar
import android.realproject.timetracker.ui.elemnts.topbars.elements.UserInfoTopBar
import android.realproject.utils.Const
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun InfoAboutDayTopBar(
    modifier: Modifier
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(Const.Padding.LARGE)
            .then(modifier),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            UserInfoTopBar(modifier = Modifier.fillMaxWidth(.6f))
            ControlsTopBar(modifier = Modifier.fillMaxWidth(.5f))
        }
    }
}