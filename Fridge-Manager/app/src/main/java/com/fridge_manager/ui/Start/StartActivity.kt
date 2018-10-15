package com.fridge_manager.ui.Start

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.fridge_manager.Adapter.MyFridgeListAdapter
import com.fridge_manager.R
import com.fridge_manager.ui.MyFridge.MyFridgeListActivity
import kotlinx.android.synthetic.main.activity_start.*
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.toast

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        start_myfridge_tv.onClick {
            val intent = Intent(this@StartActivity,MyFridgeListActivity::class.java)
            startActivity(intent)
        }
        start_consume_pattern.onClick { toast("소비패턴 분석") }
        start_nutrition.onClick { toast("영양 분석") }
    }
}