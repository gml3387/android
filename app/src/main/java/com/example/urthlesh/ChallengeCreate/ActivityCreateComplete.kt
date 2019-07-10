package com.example.urthlesh.ChallengeCreate

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.urthlesh.R
import kotlinx.android.synthetic.main.activity_create_complete.*
import kotlinx.android.synthetic.main.activity_create_content.*

class ActivityCreateComplete : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_complete)

        btn_finish_create_complete.setOnClickListener {
            setResult(Activity.RESULT_FIRST_USER)
            finish()
        }
    }
}
