package com.example.activityandfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TwoColorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_color)

        settingButtons()
    }

    fun settingButtons() {
        val redButton = findViewById<Button>(R.id.button_red_fragment)
        val blueButton = findViewById<Button>(R.id.button_blue_fragment)

        redButton.setOnClickListener {
            val fragmentTransaction =
                supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentFrame, RedFragment())
            fragmentTransaction.commit()
        }

        blueButton.setOnClickListener {
            val fragmentTransaction =
                supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentFrame, BlueFragment())
            fragmentTransaction.commit()

        }
    }
}

/*
 요약
 1. 안드로이드 앱 4대 구성요소는 액티비티, 서비스, 브로드캐스트 리시버, 콘텐트 프로바이더 이다.
 2. 액티비티는 사용자에게 UI 화면을 제공하는 앱 구성요소이다.
 3. 액티비티와 프래그먼트는 고유의 생명 주기가 존재하며 생명 주기에 따라 해야 하는 것과 할 수 있는 활동이 나누어져 있다.
 4. 0인텐트는 사용자로 하여금 액티비티를 시작하거나, 서비스를 시작하는 등 다양한 활동을 할 수 있게끔 해주는 메시징 객체이다.
 5. 프래그먼트는 분활된 화면을 독립적으로 활용하고 재사용하기에 적절한, 액티비티에 종속된 UI 구성요소 이다.
 */