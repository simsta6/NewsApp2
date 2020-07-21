package com.simsta.newsapp.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.simsta.newsapp.R
import com.simsta.newsapp.model.NewModel


class NewsListAdapter(private val context: Context, private val data: List<NewModel>): BaseAdapter() {

    private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rowView = inflater.inflate(R.layout.activity_news_list_item, parent, false)

        val title = rowView.findViewById(R.id.title_TV) as TextView
        val date = rowView.findViewById(R.id.date_TV) as TextView
        val imageView = rowView.findViewById(R.id.image_IV) as ImageView

        val currentItem = getItem(position)
        val imageUrl = currentItem.imageUrl
        title.text = currentItem.newTitle
        date.text = currentItem.newDate


        Glide.with(rowView)
            .load(imageUrl)
            .transform(CenterCrop(), RoundedCorners(8))
            .into(imageView)


        return rowView
    }

    override fun getItem(position: Int): NewModel {
        return data[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return data.size
    }


}