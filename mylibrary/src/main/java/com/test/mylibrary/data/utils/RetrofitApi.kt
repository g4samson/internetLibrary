package com.test.mylibrary.data.utils

import retrofit2.http.GET

interface RetrofitApi {
    @GET("ping")
    suspend fun ping() : String
}