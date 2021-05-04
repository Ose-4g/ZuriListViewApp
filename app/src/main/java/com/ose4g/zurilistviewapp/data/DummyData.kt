package com.ose4g.zurilistviewapp.data

import com.ose4g.zurilistviewapp.R
import com.ose4g.zurilistviewapp.models.FactModel

object DummyData
{
    val funFacts = listOf<FactModel>(
            FactModel(
                    "Python",
                    R.drawable.ic_launcher_foreground,
                    "It has a special name"
            ),
            FactModel(
                    "Java",
                    R.drawable.ic_launcher_foreground,
                    "It has a special name"
            ),
            FactModel(
                    "Kotlin",
                    R.drawable.ic_launcher_foreground,
                    "It has a special name"
            ),
            FactModel(
                    "Php",
                    R.drawable.ic_launcher_foreground,
                    "It has a special name"
            ),
            FactModel(
                    "JavaScript",
                    R.drawable.ic_launcher_foreground,
                    "It has a special name"
            )
    )
}