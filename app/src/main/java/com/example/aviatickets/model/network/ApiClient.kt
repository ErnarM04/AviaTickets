package com.example.aviatickets.model.network

import com.example.aviatickets.model.entity.Flight
import com.example.aviatickets.model.entity.Offer
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET

object ApiClient {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://my-json-server.typicode.com/estharossa/fake-api-demo/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    /**
     * think about performing network request
     */
    val instance = retrofit.create(ApiService::class.java)

    interface ApiService {
        @GET("offer_list")
        fun fetchAPIList(): Call<List<Offer>>
    }
}