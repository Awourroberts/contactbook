package com.example.contactstudent

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class contactRecycleView(var contactList: List<contact>, var context: Context):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.contact_item_list, parent, false)
        return ContactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val currentcontact = contactList.get(position)
        holder.tvName.text = currentcontact.name
        holder.tvemail.text = currentcontact.email
        holder.tvPhone.text = currentcontact.phoneNumber
        Picasso.get()
            .load(currentcontact.imageUrl)
            .resize(90, 50)
            .centerCrop()
            .placeholder(R.drawable.SOOOOOOO)
            .into(holder.ivcontact)
        holder.ivcontact.setOnClickListener {
            var intent = Intent(context, contactdetailActivity::class.java)
            intent.putExtra("name",currentcontact.name)
            intent.putExtra("mobile",currentcontact.phoneNumber)
            intent.putExtra("email",currentcontact.email)
            intent.putExtra("picture",currentcontact.imageUrl)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return contactList.size
    }


}



    class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName = itemView.findViewById<TextView>(R.id.tvName)
        var tvemail = itemView.findViewById<TextView>(R.id.tvEmailLbl)
        var tvPhone = itemView.findViewById<TextView>(R.id.tvPhoneNumber)

        //  var cvcontact=itemView.findViewById<CardView>(R.id.cvcontact)
        var ivcontact = itemView.findViewById<ImageView>(R.id.ivContact)

    }

