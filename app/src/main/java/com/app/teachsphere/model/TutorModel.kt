package com.app.teachsphere.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TutorModel(
    val id: String,
    val nama: String,
    val alamat: String,
    val harga: String,
    val gambar: Int,

    ) : Parcelable