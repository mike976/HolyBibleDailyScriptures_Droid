package com.mbullock976.hbdsp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.mbullock976.hbdsp.app.component
import com.mbullock976.hbdsp.views.fragment.AboutFragment
import com.mbullock976.hbdsp.views.fragment.DailyScripturesFragment
import com.mbullock976.hbdsp.views.fragment.StudyGuideFragment
import com.mbullock976.hbdsp.views.fragment.VerseOfTheDayFragment
import com.mbullock976.hbdsp.viewmodel.MainViewModel
import com.mbullock976.hbdsp.viewmodel.MainViewModelFactory
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var factory: MainViewModelFactory

    private lateinit var viewModel: MainViewModel

    private val dailyScripturesFragment =
        DailyScripturesFragment()
    private val verseOfTheDayFragment =
        VerseOfTheDayFragment()
    private val studyGuideFragment =
        StudyGuideFragment()
    private val aboutFragment =
        AboutFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        component.inject(this)

        navigation.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

        viewModel = ViewModelProviders.of(this, factory).get(MainViewModel::class.java)

        switchToFragment(dailyScripturesFragment)
    }

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        val fragment = when (item.itemId) {
            R.id.navigation_dailyscriptures -> dailyScripturesFragment
            R.id.navigation_versoftheday -> verseOfTheDayFragment
            R.id.navigation_studyguide -> studyGuideFragment
            R.id.navigation_about -> aboutFragment
            else -> DailyScripturesFragment()
        }
        switchToFragment(fragment)
        true
    }

    private fun switchToFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.main_container, fragment).commit()
    }
}