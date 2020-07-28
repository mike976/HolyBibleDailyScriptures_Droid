package com.mbullock976.hbdsp.views.fragment

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.mbullock976.hbdsp.BuildConfig
import com.mbullock976.hbdsp.R
import kotlinx.android.synthetic.main.fragment_about.*
import java.lang.Exception

class AboutFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_about, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        loadImages()

        val versionCode = BuildConfig.VERSION_CODE
        val versionName = BuildConfig.VERSION_NAME

        buildVersion.text = "Holy Bible Daily Scriptures v$versionName build $versionCode"

        updateTitleBar()

    }

    private fun updateTitleBar() {
        try {
            val activity = view?.context as AppCompatActivity
            activity.supportActionBar?.title = "About"

        } catch (e: Exception) {
        }
    }

    private fun loadImages() {

        activity?.let {
            appIcon.setImageResource(R.drawable.ic_launcher)

            gitHubImage.setImageResource(R.drawable.github)
            gitHubImage.setOnClickListener {
                it.context.browse("https://github.com/mike976")
            }

            emailImage.setImageResource(R.drawable.email)
            emailImage.setOnClickListener {
                it.context.email("mikebullock976@gmail.com")
            }

            linkedInImage.setImageResource(R.drawable.linked_in)
            linkedInImage.setOnClickListener {
                it.context.browse("https://uk.linkedin.com/in/michaelbullock976")
            }

            shareImage.setImageResource(R.drawable.share)
            shareImage.setOnClickListener {
                it.context.share("Hey there, Check out the 'Holy Bible Daily Scriptures app! (Android)'")
            }
        }

    }

    fun Context.share(text: String) =
        this.startActivity(Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, text)
            type = "text/plain"
        })

    fun Context.browse(text: String) =
        this.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(text)))

    fun Context.email(emailAddr: String) =
        this.startActivity(Intent().apply {
            action = Intent.ACTION_SENDTO
            data = Uri.parse("mailto:$emailAddr")
        })

}