package com.app.teachsphere.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LikedTutorModel(
    val id: String,
    val nama: String,
    val ulasan: String,
    val isLiked: Boolean,
    val gambar: Int,
) : Parcelable