package com.example.urthlesh.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.urthlesh.Activity.ChallengeDetailActivity
import com.example.urthlesh.Data.ChallengeData
import com.example.urthlesh.R

class RVChallengeAdapter(val ctx: Context, val dataList: ArrayList<ChallengeData>): RecyclerView.Adapter<RVChallengeAdapter.Holder>(){
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(ctx).inflate(R.layout.rv_item_challengeset, viewGroup, false)
        return Holder(view)
        

    }

    override fun getItemCount(): Int =dataList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        Glide.with(ctx)
            .load(dataList[position].img_url)
            .into(holder.image)
        holder.title.text = dataList[position].title
        holder.creator.text = dataList[position].creator
        holder.num_total.text = "총 " + dataList[position].num_total.toString() + "회"

    }

    inner class Holder(itemView: View): RecyclerView.ViewHolder(itemView){
        var image = itemView.findViewById(R.id.img_rv_challenge_image) as ImageView
        var title = itemView.findViewById(R.id.txt_rv_challenge_title) as TextView
        var creator = itemView.findViewById(R.id.txt_rv_challenge_creator) as TextView
        var num_total = itemView.findViewById(R.id.num_rv_challenge_total) as TextView
    }
}