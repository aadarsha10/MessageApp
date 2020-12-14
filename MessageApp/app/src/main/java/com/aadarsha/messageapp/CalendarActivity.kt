package com.aadarsha.messageapp

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class CalendarActivity : AppCompatActivity() {
    private lateinit var btnLoadCalendar:Button
    private lateinit var tvDate:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

        btnLoadCalendar=findViewById(R.id.btnLoadCalendar)
        tvDate=findViewById(R.id.tvDate)

        btnLoadCalendar.setOnClickListener {
            loadCalendar()
        }
    }

    private fun loadCalendar(){
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month=c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(this,{view, year,monthOfYear,dayOfMonth->
            tvDate.text="Selected Date: $dayOfMonth-${monthOfYear+1}-$year"
        },
            year,month,day)
        datePickerDialog.show()
    }


}