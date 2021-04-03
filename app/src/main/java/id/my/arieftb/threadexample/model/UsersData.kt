package id.my.arieftb.threadexample.model


import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class UsersData(
    val id: Int? = null,
    val email: String? = null,
    val first_name: String? = null,
    val last_name: String? = null,
    val avatar: String? = null
) : Parcelable