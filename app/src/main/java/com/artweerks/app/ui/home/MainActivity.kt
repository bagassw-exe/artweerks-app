package com.artweerks.app.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.artweerks.app.R
import com.artweerks.app.databinding.ActivityMainBinding
import com.artweerks.app.ui.auth.ArtweerksAuth
import com.artweerks.app.ui.auth.AuthActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.buttonLogout.setOnClickListener {
            ArtweerksAuth.logout(this) {
                startActivity(Intent(this, AuthActivity::class.java))
                finish()
            }
        }
    }
}