package com.mbullock976.hbdsp.views.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mbullock976.hbdsp.R
import com.mbullock976.hbdsp.extensions.inflate
import com.mbullock976.hbdsp.model.Verse
import com.mbullock976.hbdsp.views.adapter.DailyScripturesAdapter.*
import kotlinx.android.synthetic.main.list_item_dailyscripture.view.*

class DailyScripturesAdapter(val dailyScripturesList: MutableList<Verse>) : RecyclerView.Adapter<ViewHolder>() {


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private lateinit var verse: Verse

        init {
            this.verse = Verse()
        }

        fun bind(verse: Verse?) {
            if(verse != null) {
                this.verse = verse

                itemView.text.text = this.verse.text
                itemView.reference.text = this.verse.reference
                itemView.translation.text = this.verse.translatioName


            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(parent.inflate(R.layout.list_item_dailyscripture))
    }

    override fun getItemCount(): Int {
        return dailyScripturesList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dailyScripturesList[position])
    }


    fun addVerse(verse: Verse) {
        this.dailyScripturesList.add(verse)
        notifyDataSetChanged()
    }

    fun clear() {
        this.dailyScripturesList.clear()
    }

}