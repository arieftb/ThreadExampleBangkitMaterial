package id.my.arieftb.threadexample.model.example


import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class UsersResponse(
    val page: Int? = null,
    val per_page: Int? = null,
    val total: Int? = null,
    val total_pages: Int? = null,
    val `data`: List<Data>? = null,
    val support: Support? = null
) : Parcelable