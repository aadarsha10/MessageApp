package com.aadarsha.messageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton

class ImageActivity : AppCompatActivity() {
    private lateinit var rdoDuck: RadioButton
    private lateinit var rdoDog: RadioButton
    private lateinit var rdoMan: RadioButton
    private lateinit var imgProfile: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        rdoDuck =findViewById(R.id.rdoduck)
        rdoDog =findViewById(R.id.rdoDog)
        rdoMan =findViewById(R.id.rdoman)
        imgProfile=findViewById(R.id.imgProfile)

        rdoDuck.setOnClickListener{
          imgProfile.setImageResource(R.drawable.duck)
        }
        rdoDog.setOnClickListener{
            imgProfile.setImageResource(R.drawable.dog)
        }
        rdoMan.setOnClickListener{
            imgProfile.setImageResource(R.drawable.man)
        }
//        if (rdoDuck.isChecked){
//
//        }else if (rdoDog.isChecked){
//
//        }else if(rdoMan.isChecked){
//
//        }
    }
}