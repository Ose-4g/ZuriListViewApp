package com.ose4g.zurilistviewapp.data

import com.ose4g.zurilistviewapp.R
import com.ose4g.zurilistviewapp.models.FactModel

object DummyData
{
    val funFacts = listOf<FactModel>(
            FactModel(
                    "Python",
                    R.drawable.ic_python,
                    "This name ‘Python’ is extracted from a British comedy series, “Monty Python’s Flying Circus”.\n" +
                            "It is not named a snake.\n" +
                            "It is said that this was the favorite series of its inventor Guido Van Rossum.\n" +
                            "He named it Python because it is short, mysterious and unique."
            ),
            FactModel(
                    "Java",
                    R.drawable.ic_java,
                    "Java was origianlly called Oak programming language"
            ),
            FactModel(
                    "Kotlin",
                    R.drawable.ic_kotlin_icon,
                    "Kotlin is bult on top of Java. Java and Kotlin can be used in the same Android application together."
            ),
            FactModel(
                    "PHP",
                    R.drawable.ic_php_logo,
                    "Facebook was built using php"
            ),
            FactModel(
                    "JavaScript",
                    R.drawable.ic_javascript,
                    "JavaScript was created in 10 days by Brandan Eich a Netscape programmer in the year 1995\n"
            )
    )
}