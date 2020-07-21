package com.simsta.newsapp.model

import com.simsta.newsapp.contract.ContractInterface

class MainActivityModel: ContractInterface.Model {

    private var mCounter = 0

    override fun getCounter()= mCounter


    override fun incrementCounter() {
        mCounter = mCounter + 1
        mCounter++
    }
}