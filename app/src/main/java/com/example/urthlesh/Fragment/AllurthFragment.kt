package com.example.urthlesh.Fragment


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.urthlesh.Activity.CategoryDetailActivity
import com.example.urthlesh.Activity.ChallengeDetailActivity
import com.example.urthlesh.Adapter.AdvertiseAdapter
import com.example.urthlesh.Adapter.RVChallengeAdapter
import com.example.urthlesh.ChallengeCreate.ActivityCreateTitle
import com.example.urthlesh.Data.ChallengeData
import com.example.urthlesh.R
import kotlinx.android.synthetic.main.fragment_allurth.*


class AllurthFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_allurth, container, false)
    }

    lateinit var rvChallengeAdapter : RVChallengeAdapter

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        configureAdvertiseTab()

        btn_create.setOnClickListener {
            var createintent = Intent(activity, ActivityCreateTitle::class.java);
            context!!.startActivity(createintent)
        }
        imgcategory1.setOnClickListener {
            var intent = Intent(activity, CategoryDetailActivity::class.java);
            intent.putExtra("title", "카테고리1")
            intent.putExtra("main_img","https://scontent-icn1-1.xx.fbcdn.net/v/t1.0-9/58383648_1714122605401284_8261916106969579520_o.jpg?_nc_cat=107&_nc_ht=scontent-icn1-1.xx&oh=5685d155cc3622b1535485166619daff&oe=5D756045")
            context!!.startActivity(intent)
        }
        imgcategory2.setOnClickListener {
            var intent = Intent(activity, CategoryDetailActivity::class.java);
            intent.putExtra("title", "카테고리2")
            intent.putExtra("main_img","https://scontent-icn1-1.xx.fbcdn.net/v/t1.0-9/58383648_1714122605401284_8261916106969579520_o.jpg?_nc_cat=107&_nc_ht=scontent-icn1-1.xx&oh=5685d155cc3622b1535485166619daff&oe=5D756045")
            context!!.startActivity(intent)
        }
        imgcategory3.setOnClickListener {
            var intent = Intent(activity, CategoryDetailActivity::class.java);
            intent.putExtra("title", "카테고리3")
            intent.putExtra("main_img","https://scontent-icn1-1.xx.fbcdn.net/v/t1.0-9/58383648_1714122605401284_8261916106969579520_o.jpg?_nc_cat=107&_nc_ht=scontent-icn1-1.xx&oh=5685d155cc3622b1535485166619daff&oe=5D756045")
            context!!.startActivity(intent)
        }
        imgcategory4.setOnClickListener {
            var intent = Intent(activity, CategoryDetailActivity::class.java);
            intent.putExtra("title", "카테고리4")
            intent.putExtra("main_img","https://scontent-icn1-1.xx.fbcdn.net/v/t1.0-9/58383648_1714122605401284_8261916106969579520_o.jpg?_nc_cat=107&_nc_ht=scontent-icn1-1.xx&oh=5685d155cc3622b1535485166619daff&oe=5D756045")
            context!!.startActivity(intent)
        }
        imgcategory5.setOnClickListener {
            var intent = Intent(activity, CategoryDetailActivity::class.java);
            intent.putExtra("title", "카테고리5")
            intent.putExtra("main_img","https://scontent-icn1-1.xx.fbcdn.net/v/t1.0-9/58383648_1714122605401284_8261916106969579520_o.jpg?_nc_cat=107&_nc_ht=scontent-icn1-1.xx&oh=5685d155cc3622b1535485166619daff&oe=5D756045")
            context!!.startActivity(intent)
        }

        var ChallengeList: ArrayList<ChallengeData> = ArrayList()
        ChallengeList.add(ChallengeData(
            "http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png",
            "희원이와 함께하는 에코챌린지", "용이 작은누나",127))
        ChallengeList.add(ChallengeData(
            "http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png",
            "희원이와 함께하는 에코챌린지", "용이 작은누나",127))
        ChallengeList.add(ChallengeData(
            "http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png",
            "희원이와 함께하는 에코챌린지", "용이 작은누나",127))
        ChallengeList.add(ChallengeData(
            "http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png",
            "희원이와 함께하는 에코챌린지", "용이 작은누나",127))
        ChallengeList.add(ChallengeData(
            "http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png",
            "희원이와 함께하는 에코챌린지", "용이 작은누나",127))
        ChallengeList.add(ChallengeData(
            "http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png",
            "희원이와 함께하는 에코챌린지", "용이 작은누나",127))
        ChallengeList.add(ChallengeData(
            "http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png",
            "희원이와 함께하는 에코챌린지", "용이 작은누나",127))
        ChallengeList.add(ChallengeData(
            "http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png",
            "희원이와 함께하는 에코챌린지", "용이 작은누나",127))
        ChallengeList.add(ChallengeData(
            "http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png",
            "희원이와 함께하는 에코챌린지", "용이 작은누나",127))
        ChallengeList.add(ChallengeData(
            "http://sopt.org/wp/wp-content/uploads/2014/01/24_SOPT-LOGO_COLOR-1.png",
            "희원이와 함께하는 에코챌린지", "용이 작은누나",127))

        rvChallengeAdapter = RVChallengeAdapter(context!!,ChallengeList)
        rv_top10.adapter = rvChallengeAdapter
        rv_top10.layoutManager=LinearLayoutManager(context!!)

    }

    private fun configureAdvertiseTab() {

        vp_advertise.adapter = AdvertiseAdapter(childFragmentManager, 3)
        vp_advertise.offscreenPageLimit = 2
        tl_advertise_indicator.setupWithViewPager(vp_advertise)


    }
}




