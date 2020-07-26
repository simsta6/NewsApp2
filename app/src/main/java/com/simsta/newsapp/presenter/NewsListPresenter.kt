package com.simsta.newsapp.presenter

import com.simsta.newsapp.contract.ContractInterface.*
import com.simsta.newsapp.model.NewsListModel

class NewsListPresenter(_view: View): Presenter {
    private var view: View = _view
    private var model: Model = NewsListModel()

    init {
        view.initView()
    }

    override fun incrementValue() {
        model.incrementCounter()
        view.updateViewData()
    }

    override fun getCounter() = model.getCounter().toString()
}