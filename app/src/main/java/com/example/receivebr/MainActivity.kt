package com.example.receivebr

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.localbroadcastmanager.content.LocalBroadcastManager

class MainActivity : AppCompatActivity() {
    lateinit var myBroadcastReceiver: MyBroadcastReceiver
    lateinit var localBroadcastManager: LocalBroadcastManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myBroadcastReceiver = MyBroadcastReceiver()

        val intentFilter = IntentFilter()
        intentFilter.addAction("MyAction")
        localBroadcastManager = LocalBroadcastManager.getInstance(this)
        localBroadcastManager.registerReceiver(myBroadcastReceiver, intentFilter)

        initView()

    }

    private fun initView() {
       val  btn = findViewById<Button>(R.id.send_btn)
        btn.setOnClickListener {
            localBroadcastManager.sendBroadcast(Intent("MyAction"))
        }
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(myBroadcastReceiver)
    }
}