package com.example.prak8.room

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "tblsiswa")
data class Siswa(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var nama: String,
    var alamat: String,
    var telpon: String
)