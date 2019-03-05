package com.example.recyclerviewlistadapterdiffutil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpData()
    }

    private fun setUpData(){
        val viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        val userAdapter = UserAdapter()
        userAdapter.submitList(viewModel.getListUser())
        recyclerViewListUser.adapter = userAdapter
        val dividerItemDecoration = DividerItemDecoration(recyclerViewListUser.context, LinearLayoutManager.VERTICAL)
        recyclerViewListUser.addItemDecoration(dividerItemDecoration)
    }
}
