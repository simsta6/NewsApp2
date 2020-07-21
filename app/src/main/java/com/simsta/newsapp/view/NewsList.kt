package com.simsta.newsapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.simsta.newsapp.R
import com.simsta.newsapp.model.NewModel
import kotlinx.android.synthetic.main.activity_news_list.*

class NewsList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_list)

        val item1 = NewModel("aa", "aab", "https://i.imgur.com/IVVwAWr.png")
        val item2 = NewModel("aa1", "https://i.imgur.com/NOQraxs.jpeg", "https://i.imgur.com/C5IXxLp.jpeg")

        val news: List<NewModel> = arrayListOf(item1, item2)

        val adapter = NewsListAdapter(this, news)

        news_RW.adapter = adapter
    }
}
