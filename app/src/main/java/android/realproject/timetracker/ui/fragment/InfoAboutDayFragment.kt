package android.realproject.timetracker.ui.fragment

import android.realproject.data.view_model.InfoAboutDayViewModel
import android.realproject.timetracker.ui.elemnts.for_info_about_day.content.ContentAboutDay
import android.realproject.timetracker.ui.elemnts.for_info_about_day.date_elements.DateElements
import android.realproject.timetracker.ui.elemnts.topbars.InfoAboutDayTopBar
import android.realproject.utils.Const
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun InfoAboutDayFragment(
    viewModel: InfoAboutDayViewModel
) {
    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        val (topBar, dateElement, content) = createRefs()

        InfoAboutDayTopBar(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(.13f)
                .constrainAs(topBar) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                })

        DateElements(
            appDate = viewModel.date,
            modifier = Modifier
                .fillMaxWidth()
                .constrainAs(dateElement) {
                    top.linkTo(topBar.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(content.top)
                })

        ContentAboutDay(
            modifier = Modifier
                .fillMaxHeight(.57f)
                .padding(top = Const.Padding.NORMAL)
                .fillMaxWidth()
                .constrainAs(content) {
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                },
        )

    }

}