package android.realproject.timetracker

import android.os.Bundle
import android.realproject.data.date.AppDate
import android.realproject.data.view_model.InfoAboutDayViewModel
import android.realproject.model.navigate.ApplicationNavHost
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import android.realproject.timetracker.ui.theme.TimeTrackerTheme
import android.util.Log
import androidx.activity.viewModels
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    private val infoAboutViewModel: InfoAboutDayViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TimeTrackerTheme {
                val navController = rememberNavController()

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ApplicationNavHost(navController = navController, infoAboutViewModel)
                }
            }
        }
    }
}

