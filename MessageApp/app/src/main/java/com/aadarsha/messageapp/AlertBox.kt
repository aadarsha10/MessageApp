package com.aadarsha.messageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class AlertBox : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_box)

        val button : Button = findViewById(R.id.button)

        button.setOnClickListener {
            val builder= AlertDialog.Builder(this)

            builder.setTitle("My Alert")
            builder.setMessage("Are you sure?")
            builder.setIcon(android.R.drawable.ic_dialog_alert)

            builder.setPositiveButton("Yes"){_,_ ->
                Toast.makeText(applicationContext,"Clicked yes",Toast.LENGTH_LONG).show()
            }

            builder.setNeutralButton("Cancel"){_,_ ->
                Toast.makeText(applicationContext,"Clicked Cancel",Toast.LENGTH_LONG).show()
            }

            builder.setNegativeButton("No"){_,_ ->
                Toast.makeText(applicationContext,"Clicked no",Toast.LENGTH_LONG).show()
            }

            val alertDialog:AlertDialog=builder.create()
            alertDialog.setCancelable(true)
            alertDialog.show()
        }
    }
}