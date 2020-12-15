package com.aadarsha.messageapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class TimePickerActivity : AppCompatActivity() {

    private lateinit var btnLoadTime: Button
    private lateinit var tvTime: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_picker)

        btnLoadTime=findViewById(R.id.btnLoadTime)
        tvTime=findViewById(R.id.tvTime)

        btnLoadTime.setOnClickListener {
            loadTimePick()
        }

    }

    private fun loadTimePick() {
        val c = Calendar.getInstance()
        val hour= c.get(Calendar.HOUR_OF_DAY)
        val minute = c.get(Calendar.MINUTE)
//        val abv = c.get(Calendar.AM_PM)
        var ampm =""

        val timePickerDialog= TimePickerDialog(this, { timePicker,hour,minute,->
            if (hour<=11){ampm = "AM"} else{ampm="PM"}
            tvTime.text="$hour:$minute:$ampm"

        },
        hour,minute,true)

        
        timePickerDialog.show()
    }
}