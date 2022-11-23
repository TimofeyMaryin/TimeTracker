package android.realproject.data.db.about_day

import android.realproject.data.db.CategoryItemInfo
import android.realproject.utils.Const
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


/**
 * ПРЕДСТОИТ РЕАЛИЗОВАТЬ ЕЩЕ
 */

@Entity(tableName = Const.TableName.ABOUT_DAY)
data class InfoAboutDayEntity(
    @PrimaryKey(autoGenerate = true) var idDay: Long = 0,
    @ColumnInfo(name = "info_day_item") val infoItem: MutableList<CategoryItemInfo> = mutableListOf(),
    @ColumnInfo(name = "plan_for_day") val planForDay: MutableList<PlanForDayInfo>
)
