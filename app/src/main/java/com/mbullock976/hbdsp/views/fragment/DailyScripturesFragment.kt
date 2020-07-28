package com.mbullock976.hbdsp.views.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.mbullock976.hbdsp.R
import com.mbullock976.hbdsp.model.Bible
import com.mbullock976.hbdsp.model.Verse
import com.mbullock976.hbdsp.network.ApiError
import com.mbullock976.hbdsp.network.response.ApiResponseStatus
import com.mbullock976.hbdsp.viewmodel.MainViewModel
import com.mbullock976.hbdsp.views.adapter.DailyScripturesAdapter
import kotlinx.android.synthetic.main.fragment_dailyscriptures.*
import java.lang.Exception
import kotlin.random.Random

class DailyScripturesFragment : Fragment() {

    private lateinit var viewModel: MainViewModel

    private val adapter =
        DailyScripturesAdapter(
            mutableListOf()
        )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dailyscriptures, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        //Note the app has one activity - MainActivity - so we pull out the MainViewModel.
        //To share the same instance of MainViewModel across fragments, we're using the mainactivity to provide us the viewmodel
        viewModel = activity?.let { ViewModelProviders.of(it).get(MainViewModel::class.java) }!!

        dailyScripturesRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        dailyScripturesRecyclerView.adapter = adapter

        this.updateTitleBar()
        this.updateDailyScriptures()
    }

    private fun updateDailyScriptures() {

        adapter.clear()

        addNewTestamentVerse()
        addPsalmsVerse()
        addProverbsVerse()

    }

    private fun addNewTestamentVerse() {

        viewModel.addNewTestamentVerse()?.observe(this, Observer { responseMessage ->

            if (responseMessage?.statusApi == ApiResponseStatus.SUCCESS && responseMessage.data != null) {
                val verse = responseMessage.data

                if(verse != null) {
                    adapter.addVerse(verse)
                }
            } else {
                if (responseMessage?.error == ApiError.GETVERSE) {
                    Toast.makeText(context, "No New Testament Verse found", Toast.LENGTH_SHORT).show()
                }
            }
        })
    }

    private fun addPsalmsVerse() {

        viewModel.addPsalmsVerse()?.observe(this, Observer { responseMessage ->

            if (responseMessage?.statusApi == ApiResponseStatus.SUCCESS && responseMessage.data != null) {
                val verse = responseMessage.data

                if(verse != null) {
                    adapter.addVerse(verse)
                }
            } else {
                if (responseMessage?.error == ApiError.GETVERSE) {
                    Toast.makeText(context, "No Psalm Verse found", Toast.LENGTH_SHORT).show()
                }
            }
        })
    }

    private fun addProverbsVerse() {
        viewModel.addProverbsVerse()?.observe(this, Observer { responseMessage ->

            if (responseMessage?.statusApi == ApiResponseStatus.SUCCESS && responseMessage.data != null) {
                val verse = responseMessage.data

                if(verse != null) {
                    adapter.addVerse(verse)
                }
            } else {
                if (responseMessage?.error == ApiError.GETVERSE) {
                    Toast.makeText(context, "No Proverbs Verse found", Toast.LENGTH_SHORT).show()
                }
            }
        })
    }

    private fun updateTitleBar() {
        try {
            val activity = view?.context as AppCompatActivity
            activity.supportActionBar?.title = "Holy Bible Daily Scriptures"

        } catch (e: Exception) {
        }
    }

}