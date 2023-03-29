package com.emmanuel_rono.shared_view_model

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.emmanuel_rono.shared_view_model.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var navcontroller:NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentController) as NavHostFragment
        navcontroller=navHostFragment.navController
        setupActionBarWithNavController(navcontroller)
    }
    override fun onNavigateUp(): Boolean {
        return  navcontroller.navigateUp() || super.onSupportNavigateUp()
    }
}