package com.anand.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //this basically sets the fragment to the container
        //1st param -> container ID
        //2nd param -> fragment to be put
        supportFragmentManager.beginTransaction().replace(R.id.frame_layout, FirstFragment()).commit()

    }


    //this function is used to put/show the 2nd fragment
    //we cant
    fun replace2ndFrag(text: String) {
        supportFragmentManager.beginTransaction().replace(R.id.frame_layout, SecondFragment.newInstance(text)).commit()
    }


    //for every transaction, we need to call commit()
}
