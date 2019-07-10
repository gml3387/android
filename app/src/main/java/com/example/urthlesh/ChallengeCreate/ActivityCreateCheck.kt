package com.example.urthlesh.ChallengeCreate

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.urthlesh.R
import kotlinx.android.synthetic.main.activity_create_category.*
import kotlinx.android.synthetic.main.activity_create_check.*
import kotlinx.android.synthetic.main.activity_create_content.*

class ActivityCreateCheck : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_check)

        btn_back_create_check.setOnClickListener {
            setResult(Activity.RESULT_OK)
            finish()
        }
        btn_cancel_create_check.setOnClickListener {
            setResult(Activity.RESULT_FIRST_USER)
            finish()
        }

        btn_finish_create_check.setOnClickListener {
            val createfinishcheck = Intent(this, ActivityCreateComplete::class.java);
            startActivityForResult(createfinishcheck, 127)
        }

    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 127){
            if(resultCode == Activity.RESULT_FIRST_USER){
                finish()
            }
        }
    }
}
