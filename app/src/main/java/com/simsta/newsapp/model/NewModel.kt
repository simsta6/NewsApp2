package com.simsta.newsapp.model

import com.simsta.newsapp.contract.ContractInterface
import java.util.*

class NewModel(title: String, date: String, imgUrl: String): ContractInterface.NModel  {
    val newTitle: String
    val newDate: String
    val imageUrl: String

    init {
        newTitle = title
        newDate = date
        imageUrl = imgUrl
    }
}