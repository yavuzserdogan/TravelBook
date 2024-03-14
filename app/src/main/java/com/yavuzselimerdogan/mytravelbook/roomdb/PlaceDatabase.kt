package com.yavuzselimerdogan.mytravelbook.roomdb

import androidx.room.Dao
import androidx.room.Database
import androidx.room.RoomDatabase
import com.yavuzselimerdogan.mytravelbook.model.Place

@Database(entities = [Place::class], version = 1)
abstract class PlaceDatabase : RoomDatabase() {
    abstract fun placeDao(): PlaceDao
}