package com.mbullock976.hbdsp.network

import com.mbullock976.hbdsp.network.response.VerseApiResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.Url

interface IApiClient {

    @GET
    fun getVerse(@Url url: String) : Call<VerseApiResponse>
}

//https://bible-api.com/romans+12:1-2