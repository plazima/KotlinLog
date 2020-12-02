package jp.techacademy.takumi.hatae.kotlinglog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("りく", 16,"バドミントン")
        val human2 = Human("かいと",20,"洋楽")

        human.say()

        human.think()

        human2.say()

        human2.think()

    }
}
