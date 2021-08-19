package com.nepplus.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveToOtherBtn.setOnClickListener {
            //버튼을 눌리면 => OtherActivity로 이동
            //Main -> Other

            val myIntent = Intent( this, OtherActivity2 :: class.java )
            startActivity(myIntent)


        }
    }
}