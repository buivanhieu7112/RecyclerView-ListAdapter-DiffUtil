package com.example.recyclerviewlistadapterdiffutil

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var users = mutableListOf<User>()
    fun getListUser(): MutableList<User> {
        for (i in 1..5) {
            val user = User()
            user.name = "nguyen van a"
            user.email = "anguyenvan@gmail.com"
            users.add(user)
        }
        return users
    }
}
