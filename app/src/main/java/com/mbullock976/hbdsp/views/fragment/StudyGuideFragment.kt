package com.mbullock976.hbdsp.views.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.mbullock976.hbdsp.R
import kotlinx.android.synthetic.main.fragment_study_guide.*
import java.lang.Exception

class StudyGuideFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_study_guide, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        updateTitleBar()
    }

    private fun updateTitleBar() {
        try {
            val activity = view?.context as AppCompatActivity
            activity.supportActionBar?.title = "Holy Bible Study Guide"

        } catch (e: Exception) {
        }
    }
}