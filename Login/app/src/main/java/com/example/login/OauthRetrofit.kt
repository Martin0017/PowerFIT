package com.example.login

import OauthService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object OauthRetrofit {


    private const val BASE_URL = "http://192.168.100.115:3003/"

    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val apiService: OauthService by lazy {
        retrofit.create(OauthService::class.java)
    }

}
