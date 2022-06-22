package com.rehan.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvDemo: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvDemo = findViewById(R.id.rvDemo)
        rvDemo.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemLayoutModel>()

        for (i in 1..100){
            //this ItemLayoutModel class contains 2 parameters i.e. image and txt
            data.add(ItemLayoutModel(R.drawable.ic_launcher_foreground, "Android $i"))

            // This will store the ArrayList data to our Adapter class
            val adapter = Adapter(data)

            //setting adapter in recyclerview
            rvDemo.adapter = adapter
        }
    }
}