package com.example.urthlesh.Activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.urthlesh.Adapter.RVChallengeAdapter
import com.example.urthlesh.Data.ChallengeData
import kotlinx.android.synthetic.main.activity_category_detail.*
import kotlinx.android.synthetic.main.fragment_allurth.*


class CategoryDetailActivity : AppCompatActivity() {
    lateinit var rvChallengeAdapter : RVChallengeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.urthlesh.R.layout.activity_category_detail)
        btn_back_category_detail.setOnClickListener {
            finish()
        }
        txt_category_title.text = intent.getStringExtra("title")
        val img_url = intent.getStringExtra("main_img")
        Glide.with(this).load(img_url).into(img_category_detail_main)

        var ChallengeList: ArrayList<ChallengeData> = ArrayList()
        ChallengeList.add(ChallengeData(
            "http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png",
            "희원이와 함께하는 에코챌린지", "용이 작은누나",127))
        ChallengeList.add(ChallengeData(
            "http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png",
            "희원이와 함께하는 에코챌린지", "용이 작은누나",127))


        val challengeadapter = RVChallengeAdapter(this, ChallengeList)
        rv_challenge_category.adapter = challengeadapter

        val lm = LinearLayoutManager(this)
        rv_challenge_category.layoutManager = lm
        rv_challenge_category.setHasFixedSize(true)
    }

}




