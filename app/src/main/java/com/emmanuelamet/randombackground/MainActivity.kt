package com.emmanuelamet.randombackground

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnTap.setOnClickListener{
            val background = arrayListOf(Color.BLACK, Color.LTGRAY, Color.RED, Color.YELLOW, Color.GREEN)
            mainView.setBackgroundColor(background[getRandom(background.size)])
        }
    }

    fun getRandom(number: Int): Int{
        var rand = Random()
        var randomNum = rand.nextInt(number)
        return  randomNum
    }
}
