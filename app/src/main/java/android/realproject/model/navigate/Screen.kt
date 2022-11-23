package android.realproject.model.navigate

sealed class Screen(val route: String) {
    object InfoAboutDayScreen: Screen("info_about_day")
    object OnBoardingScreen: Screen("on_boarding")
    object StatisticForWeekScreen: Screen("statistic_screen")

}
