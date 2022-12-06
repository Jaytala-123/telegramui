package com.jaytala.telegramui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.widget.Toast
import com.google.android.material.navigation.NavigationView
import com.jaytala.telegramui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.menu.setOnClickListener {

            binding.drawer.openDrawer(Gravity.LEFT)

        }
        binding.navView.setNavigationItemSelectedListener(object :NavigationView.OnNavigationItemSelectedListener{
            override fun onNavigationItemSelected(item: MenuItem): Boolean {

                when(item.itemId){
                    R.id.newGroup -> {
                        Toast.makeText(applicationContext, "New Group", Toast.LENGTH_SHORT).show()
                    }

                    R.id.contact -> {
                        Toast.makeText(applicationContext, "Contact", Toast.LENGTH_SHORT).show()
                    }

                    R.id.call -> {
                        Toast.makeText(applicationContext, "Call", Toast.LENGTH_SHORT).show()
                    }

                    R.id.nearby -> {
                        Toast.makeText(applicationContext, "People Nearby", Toast.LENGTH_SHORT).show()
                    }

                }

                return true

            }

        })

    }
}