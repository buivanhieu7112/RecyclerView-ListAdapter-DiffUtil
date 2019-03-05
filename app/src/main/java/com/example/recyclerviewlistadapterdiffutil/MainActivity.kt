package com.example.recyclerviewlistadapterdiffutil

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ItemCLickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpData()
    }

    private fun setUpData() {
        val viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        val userAdapter = UserAdapter(this)
        userAdapter.submitList(viewModel.getListUser())
        recyclerViewListUser.adapter = userAdapter
        val dividerItemDecoration = DividerItemDecoration(recyclerViewListUser.context, LinearLayoutManager.VERTICAL)
        recyclerViewListUser.addItemDecoration(dividerItemDecoration)
    }

    override fun onItemCLick(user: User, position: Int) {
        Toast.makeText(this,user.name + position.toString(),Toast.LENGTH_SHORT).show()
    }
}
