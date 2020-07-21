package com.simsta.newsapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.simsta.newsapp.R
import com.simsta.newsapp.model.NewModel
import kotlinx.android.synthetic.main.activity_news_list.*

class NewsListItem : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_list_item)
    }
}
