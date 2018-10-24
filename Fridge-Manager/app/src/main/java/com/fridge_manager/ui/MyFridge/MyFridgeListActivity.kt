package com.fridge_manager.ui.MyFridge

import android.app.Dialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.PopupMenu
import android.widget.PopupWindow
import com.fridge_manager.Adapter.MyFridgeListAdapter
import com.fridge_manager.Model.MyFridgeItem
import com.fridge_manager.R
import kotlinx.android.synthetic.main.activity_myfridgelist.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class MyFridgeListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_myfridgelist)

        val sampledata = arrayListOf<MyFridgeItem>().apply {
            for(i in 1..5)
                add(MyFridgeItem("사무실 냉장고","2018/00/00",i.toString()))
        }

        val listadapter = MyFridgeListAdapter(sampledata)

        with(myfridgelist_rv){
            adapter = listadapter
            }

        myfridgelist_menu.onClick {
            val view = layoutInflater.inflate(R.layout.popup_myfridgelist,null)
            val popupWindow = PopupWindow(view,ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT)
            popupWindow.showAtLocation(view,Gravity.END,0,0)
            popupWindow.isFocusable = true



        }

        }
}