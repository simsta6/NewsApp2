package com.simsta.newsapp.presenter

import com.simsta.newsapp.contract.ContractInterface.*
import com.simsta.newsapp.model.MainActivityModel
import com.simsta.newsapp.contract.ContractInterface

class MainActivityPresenter(_view: View): ContractInterface.Presenter {

    private var view: View = _view
    private var model: Model = MainActivityModel()

    init {
        view.initView()
    }

    override fun incrementValue() {
        model.incrementCounter()
        view.updateViewData()
    }

    override fun getCounter() = model.getCounter().toString()
}