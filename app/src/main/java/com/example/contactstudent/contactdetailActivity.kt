package com.example.contactstudent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class contactdetailActivity : AppCompatActivity() {
//    lateinit var tvName=TextView
//    lateinit var tvEmail=TextView
//    lateinit var tvPhoneNumber:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contact_item_list)
        var intent=intent
        var name =intent.getStringExtra("Name")
        var nameintent=intent.getStringExtra("Name")
        var phoneNumberintent =intent.getStringExtra("PhoneNumber")
        var emailintent =intent.getStringExtra("Email")
        var imageIntent=intent.getStringExtra("image").toString()

        var tvName=findViewById<TextView>(R.id.tvName)
        var tvPhone=findViewById<TextView>(R.id.tvPhoneNumber)
        var tvEmail=findViewById<TextView>(R.id.tvEmailLbl)
        var ivimage=findViewById<ImageView>(R.id.ivContact)
        Toast.makeText(baseContext,name,Toast.LENGTH_LONG).show()

        tvName.text=nameintent
        tvEmail.text=emailintent
        tvPhone.text=phoneNumberintent










    }
}