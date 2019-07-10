package com.example.urthlesh.Activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.urthlesh.R
import kotlinx.android.synthetic.main.activity_challenge_detail.*

class ChallengeDetailActivity : AppCompatActivity() {
    lateinit var title: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_challenge_detail)

        var title = intent.getStringExtra("title")
        txt_challenge_detail_title.text = title

        btn_back_challenge_detail.setOnClickListener{
            finish()
        }
    }

}
