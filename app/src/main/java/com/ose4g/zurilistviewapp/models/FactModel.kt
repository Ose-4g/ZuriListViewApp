package com.ose4g.zurilistviewapp.models

import androidx.annotation.DrawableRes

data class FactModel (
        val name:String,
        @DrawableRes val logo: Int,
        val fact:String
)