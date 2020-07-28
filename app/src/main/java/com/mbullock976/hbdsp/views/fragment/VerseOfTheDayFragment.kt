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
import com.mbullock976.hbdsp.model.Verse
import com.mbullock976.hbdsp.network.ApiError
import com.mbullock976.hbdsp.network.response.ApiResponseStatus
import com.mbullock976.hbdsp.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.fragment_dailyscriptures.*
import kotlinx.android.synthetic.main.fragment_verseoftheday.*
import java.lang.Exception
import kotlin.random.Random

class VerseOfTheDayFragment : Fragment() {

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_verseoftheday, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = activity?.let { ViewModelProviders.of(it).get(MainViewModel::class.java) }!!

        this.updateTitleBar()
        this.updateVerseOfTheDay()
    }

    private fun updateVerseOfTheDay() {

        val randomBookIndex = Random.nextInt(1, 3)
        when (randomBookIndex) {
            1 -> addNewTestamentVerse()
            2 -> addPsalmsVerse()
            3 -> addProverbsVerse()
        else -> addPsalmsVerse()
        }
    }

    private fun addNewTestamentVerse() {

        viewModel.addNewTestamentVerse()?.observe(this, Observer { responseMessage ->

            if (responseMessage?.statusApi == ApiResponseStatus.SUCCESS && responseMessage.data != null) {
                val verse = responseMessage.data

                this.updateLabels(verse)

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

                this.updateLabels(verse)
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

                this.updateLabels(verse)
            } else {
                if (responseMessage?.error == ApiError.GETVERSE) {
                    Toast.makeText(context, "No Proverbs Verse found", Toast.LENGTH_SHORT).show()
                }
            }
        })
    }

    private fun updateLabels(verse: Verse?) {
        referenceLabel.text = verse?.reference
        translationLabel.text = verse?.translatioName
        textLabel.text = verse?.text
    }

    private fun updateTitleBar() {
        try {
            val activity = view?.context as AppCompatActivity
            activity.supportActionBar?.title = "Holy Bible Verse of the Day"

        } catch (e: Exception) {
        }
    }
}