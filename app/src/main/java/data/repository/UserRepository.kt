package com.example.gestiondesdonnees.data.repository

import androidx.lifecycle.LiveData
import com.example.gestiondesdonnees.data.dao.UserDao
import com.example.gestiondesdonnees.data.model.User

class UserRepository(private val userDao: UserDao) {

    val allUsers: LiveData<List<User>> = userDao.getAllUsers()

    suspend fun insert(user: User) {
        userDao.insert(user)
    }

    suspend fun delete(user: User) {
        userDao.deleteUser(user)
    }
}
