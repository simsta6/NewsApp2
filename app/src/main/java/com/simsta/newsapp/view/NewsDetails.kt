package com.simsta.newsapp.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import com.bumptech.glide.Glide
import com.simsta.newsapp.R
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_news_details.*
import kotlinx.android.synthetic.main.activity_news_details.view.*
import kotlinx.android.synthetic.main.activity_news_details.view.image


class NewsDetails : AppCompatActivity() {

    private val EXTRA_IMAGE = "https://i.imgur.com/kXPACCz.jpg"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_details)

        ViewCompat.setTransitionName(findViewById(R.id.app_bar_layout), EXTRA_IMAGE)

        Glide.with(this)
            .load(EXTRA_IMAGE)
            .into(image)

//        description.text = "bruuuuuuuuuuuuh"
//        newsTitle.text = "broooooo"
//        date.text = "2018-15"

    }

}
