package com.diki.recyclerviewkotlin

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Superhero(
    val imgSuperhero : Int,
    val nameSuperhero: String,
    val descSuperhero: String
):Parcelable
