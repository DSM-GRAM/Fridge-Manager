package com.fridge_manager.ui.MyFridge

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.fridge_manager.Adapter.MyFridgeListAdapter
import com.fridge_manager.Model.MyFridgeItem
import com.fridge_manager.R
import kotlinx.android.synthetic.main.activity_myfridgelist.*

class MyFridgeListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_myfridgelist)

        val sampledata = arrayListOf<MyFridgeItem>().apply {
            for(i in 1..5)
                add(MyFridgeItem("사무실 냉장고","2018/00/00",i.toString()))
        }

        val listadapter = MyFridgeListAdapter(sampledata)

        with(myfridge_rv){
            adapter = listadapter
            layoutManager = object : LinearLayoutManager(this@MyFridgeListActivity){
                override fun canScrollVertically(): Boolean {
                    return false
                }
            }
        }


    }
}