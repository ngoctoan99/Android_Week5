package com.example.androidweek5.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class User(var fullname : String?, var email:String?, var phone : String?) : Parcelable {
}