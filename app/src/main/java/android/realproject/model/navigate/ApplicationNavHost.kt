package android.realproject.model.navigate

import android.realproject.data.view_model.InfoAboutDayViewModel
import android.realproject.timetracker.fragment.InfoAboutDayFragment
import android.realproject.timetracker.fragment.OnBoarding
import android.realproject.timetracker.fragment.StatisticForWeek
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun ApplicationNavHost(
    navController: NavHostController,
    infoAvoutViewModel: InfoAboutDayViewModel
) {
    NavHost(
        navController = navController,
        startDestination = Screen.InfoAboutDayScreen.route
    ) {
        composable(
            Screen.InfoAboutDayScreen.route
        ) {
            InfoAboutDayFragment(infoAvoutViewModel)
        }

        composable(
            Screen.OnBoardingScreen.route
        ) {
            OnBoarding()
        }
        composable(
            Screen.StatisticForWeekScreen.route
        ) {
            StatisticForWeek()
        }

    }
}