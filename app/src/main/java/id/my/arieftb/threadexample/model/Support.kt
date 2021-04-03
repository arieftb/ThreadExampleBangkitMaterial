package id.my.arieftb.threadexample.model


import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class Support(
    val url: String? = null,
    val text: String? = null
) : Parcelable