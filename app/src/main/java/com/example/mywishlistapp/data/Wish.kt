package com.example.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(@PrimaryKey(autoGenerate = true) val id: Long = 0L, @ColumnInfo(name = "wish-title") val title: String = "", @ColumnInfo(name = "wish-desc") val description: String = "")

object DummyWish{
    val wishList = listOf(Wish(title = "Apple Watch Ultra", description = "An Apple Watch"),
        Wish(title = "iPhone 15 Pro Max", description = "An Apple Phone"))
}
