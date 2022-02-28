package com.example.kotlinintentindependentstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btnMoveToFirst.setOnClickListener {

//            val mySecondIntent : Intent = Intent(this@SecondActivity, MainActivity :: class.java)
//            startActivity(mySecondIntent)

//            이런식으로 이전화면으로 돌아갈 때에도 Intet를 한다면
//            화면이 A -> B -> A  |  B가 종료되면 A -> A | 즉 A를 종료하더라도 A가 남아있는 현상이 발생합니다.

            finish() // finish()만 해야 액티비티 스택이 쌓이지 않고 Main만 남게 됩니다.
        }
    }
}