package com.aadarsha.messageapp

import android.app.DatePickerDialog
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

import java.util.*

class DateTimeDifferenceActivity : AppCompatActivity() {
    private lateinit var etdob: EditText
    private lateinit var etworkjoin: EditText
    private lateinit var tvAge:TextView
    private lateinit var tvYearsworked:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_time_difference)

        etdob=findViewById(R.id.etdob)
        etworkjoin=findViewById(R.id.etworkjoin)

        tvAge=findViewById(R.id.tvAge)
        tvYearsworked=findViewById(R.id.tvYearsworked)

        etdob.setOnClickListener {
            DOBcalendar()
        }
        etworkjoin.setOnClickListener {
            workcalendar()
        }
    }

    private fun workcalendar() {
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month=c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(this,{view, yearUser,monthOfYear,dayOfMonth->
            if (monthOfYear==month){
                tvYearsworked.text="Duration worked: ${year-yearUser} years and ${(monthOfYear+1)} months"
            }else{
                tvYearsworked.text="Duration worked: ${year-yearUser} years and ${(month+1)-(monthOfYear+1)} months"
            }

            etworkjoin.setText("$yearUser-${monthOfYear+1}-$dayOfMonth")
        },
            year,month,day)
        datePickerDialog.show()

    }

    private fun DOBcalendar() {
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month=c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(this,{view, yearuser,monthOfYr,dayOfMonth->
            if (monthOfYr==month){
                tvAge.text="Your age: ${year - yearuser} years and ${(monthOfYr+1)} months"
            }else{
                tvAge.text="Your age: ${year - yearuser} years and ${(month+1)-(monthOfYr+1)} months"
            }
            etdob.setText("$yearuser-${monthOfYr+1}-$dayOfMonth")
            },
            year-20,month,day)
        datePickerDialog.show()
    }

}