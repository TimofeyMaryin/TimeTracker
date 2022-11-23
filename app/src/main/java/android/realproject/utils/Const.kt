package android.realproject.utils

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp

object Const {
    object TableName{
        const val ABOUT_DAY = "info_about_day_entity"
    }

    object TextSize {
        val SMALL = 14.sp
        val NORMAL = 16.sp
        val LARGE = 18.sp
    }
    object Padding {
        val SMALL = 5.dp
        val NORMAL = 10.dp
        val LARGE = 15.dp
    }

    object RoundedCorner {
        val SMALL = RoundedCornerShape(5)
        val NORMAL = RoundedCornerShape(15)
        val LARGE = RoundedCornerShape(25)
    }
}