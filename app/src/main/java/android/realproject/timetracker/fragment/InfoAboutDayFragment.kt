package android.realproject.timetracker.fragment

import android.realproject.data.view_model.InfoAboutDayViewModel
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign

@Composable
fun InfoAboutDayFragment(
    viewModel: InfoAboutDayViewModel
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        backgroundColor = Color.Red
    ) {
        Text(
            text = viewModel.currentDay.toString(),
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
    }
}