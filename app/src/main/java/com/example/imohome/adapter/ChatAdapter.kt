package com.example.imohome.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.imohome.R
import com.example.imohome.model.User
import com.google.android.material.imageview.ShapeableImageView

class ChatAdapter(var context: Context, var users:ArrayList<User>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        val user = users[position]

        if (holder is UserViewHolder){
            var iv_profile = holder.iv_profle
            var tv_fullname = holder.tv_fullname
            var tv_unread_message = holder.tv_unread_message

            iv_profile.setImageResource(user.image)
            tv_fullname.text = user.fullname
            tv_unread_message.text = user.unreadMessage.toString()
            if (user.unreadMessage > 0){
                tv_unread_message.visibility = View.VISIBLE
            }else{
                tv_unread_message.visibility = View.GONE
            }
        }
    }

    override fun getItemCount(): Int {
        return users.size
    }

    class UserViewHolder(view: View):RecyclerView.ViewHolder(view){
        var iv_profle : ShapeableImageView
        var tv_fullname : TextView
        var tv_unread_message: TextView

        init {
            iv_profle = view.findViewById(R.id.iv_profile)
            tv_fullname = view.findViewById(R.id.fullname)
            tv_unread_message = view.findViewById(R.id.number_unread_message)
        }
    }
}