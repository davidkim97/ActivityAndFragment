package com.example.activityandfragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        settingButton()
    }

    fun settingButton() {
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, SubActivity::class.java)
            startActivity(intent)
        }
    }
}

/*
 프레그먼트
 1. 꼭 액티비티 안에 종속되어야 한다.
 2. 액티비티의 생명 주기에 영향을 받지만, 프래그먼트 고유의 생명 주기가 존재.
 3. 액티비티가 실행 중일 때 프래그먼트를 추가하거나 제거할 수 있다.

 프래그먼트 생명주기
 1. onAttach() : 프래그먼트가 호스트 액티비티에 더해시고 나서 호출 되는 함수.
 2. onCreate() : 프래그먼트가 최초로 생성된 시점에 호출되는 함수.
 3. onCreateView() : 프래그먼트에 그릴 뷰를 생성할때 호출되는 함수. 이 함수에서 그릴 뷰를 반환해야 한다.
 4. onActivityCreated() : 액티비티의 onCreate() 함수가 완료되고 나서 실행되는 함수.
 */