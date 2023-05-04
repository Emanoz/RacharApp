package com.emanoz.racharapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.emanoz.racharapp.R
import com.emanoz.racharapp.databinding.ActivityOnBoardingBinding

class OnBoardingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOnBoardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = OnBoardingViewPageAdapter(this)
        binding.viewPager.adapter = adapter
    }
}