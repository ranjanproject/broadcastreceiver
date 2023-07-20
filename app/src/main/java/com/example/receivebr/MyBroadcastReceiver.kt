package com.example.receivebr

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyBroadcastReceiver: BroadcastReceiver() {

    override fun onReceive(p0: Context?, p1: Intent?) {
        p1?.action?.let {
//           val isAeroplaneModeON = p1.getBooleanExtra("state", false)
//           val name = if(isAeroplaneModeON) "AeroplaneMode is On" else "AeroplaneMode is off"
            Toast.makeText(p0, "local broadcast triggered", Toast.LENGTH_LONG).show()
        }
    }


}