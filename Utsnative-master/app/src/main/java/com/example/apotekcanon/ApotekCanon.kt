package com.example.apotekcanon

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ApotekCanon(
    val imgObat : Int,
    val titleObat :String,
    val descObat : String
) : Parcelable
