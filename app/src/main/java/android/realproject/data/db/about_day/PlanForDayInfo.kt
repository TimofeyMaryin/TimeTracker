package android.realproject.data.db.about_day

import android.realproject.data.db.ImportanceLevel

data class PlanForDayInfo(
    val importanceLevel: ImportanceLevel,
    val title: String,
    val postTitle: String,
    val icon: Int? = null,
)
