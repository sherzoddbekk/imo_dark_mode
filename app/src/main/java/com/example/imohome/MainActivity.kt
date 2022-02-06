package com.example.imohome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.imohome.adapter.ChatAdapter
import com.example.imohome.model.User

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }
    private fun initView(){
        recyclerView = findViewById(R.id.recycle_view)
        recyclerView.layoutManager = GridLayoutManager(this,1)

        refrashAdapter(getUsers())
    }
    private  fun refrashAdapter(users:ArrayList<User>){
        val adapter = ChatAdapter(this,users)
        recyclerView.adapter = adapter
    }

    private fun getUsers():ArrayList<User>{
        val users : ArrayList<User> = ArrayList()
        users.add(User("Sherzod Jurabekov",R.drawable.sherzod,3))
        users.add(User("Rasulbek Qodirov",R.drawable.rasulbek,5))
        users.add(User("Bobur G'aybullayev",R.drawable.bobur,2))
        users.add(User("Humoyun Mirzozoda",R.drawable.humoyun,7))
        users.add(User("Sherzod Jurabekov",R.drawable.sherzod,3))
        users.add(User("Rasulbek Qodirov",R.drawable.rasulbek,5))
        users.add(User("Bobur G'aybullayev",R.drawable.bobur,2))
        users.add(User("Humoyun Mirzozoda",R.drawable.humoyun,7))
        users.add(User("Sherzod Jurabekov",R.drawable.sherzod,3))
        users.add(User("Rasulbek Qodirov",R.drawable.rasulbek,5))
        users.add(User("Bobur G'aybullayev",R.drawable.bobur,2))
        users.add(User("Humoyun Mirzozoda",R.drawable.humoyun,7))
        users.add(User("Sherzod Jurabekov",R.drawable.sherzod,3))
        users.add(User("Rasulbek Qodirov",R.drawable.rasulbek,5))
        users.add(User("Bobur G'aybullayev",R.drawable.bobur,2))
        users.add(User("Humoyun Mirzozoda",R.drawable.humoyun,7))

        return users
    }
}