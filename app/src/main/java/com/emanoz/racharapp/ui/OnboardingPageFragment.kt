package com.emanoz.racharapp.ui

import android.content.res.Resources
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.emanoz.racharapp.R
import com.emanoz.racharapp.databinding.FragmentOnboardingPageBinding

private const val ARG_TITLE = "title"
private const val ARG_SUBTITLE = "subtitle"
private const val ARG_IMAGE = "image"

class OnboardingPageFragment : Fragment() {

    private lateinit var binding: FragmentOnboardingPageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnboardingPageBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        with(binding) {
            TitleText.text = arguments?.getString(ARG_TITLE)
            SubTitleText.text = arguments?.getString(ARG_SUBTITLE)
            ImageView.setImageResource(requireArguments().getInt(ARG_IMAGE))
        }
    }
}

class OnBoardingViewPageAdapter(val activity: FragmentActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        val page = OnboardingPageFragment()

        page.arguments = Bundle().apply {
            putString(ARG_TITLE, this@OnBoardingViewPageAdapter.activity.resources.getString(R.string.ViewPagerTitle0))
            putInt(ARG_IMAGE, R.drawable.img_onboarding_0)
            putString(ARG_SUBTITLE, this@OnBoardingViewPageAdapter.activity.resources.getString(R.string.ViewPagerSubTitle0))
        }

        return page
    }
}