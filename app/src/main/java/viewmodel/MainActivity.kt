package com.example.gestiondesdonnees.viewmodel

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.gestiondesdonnees.R

class MainActivity : AppCompatActivity() {

    private val userViewModel: UserViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userViewModel.allUsers.observe(this, Observer { users ->
            // Mettez à jour l'interface utilisateur avec la liste des utilisateurs
        })
    }
}
