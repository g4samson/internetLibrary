package com.test.mylibrary.data.utils

import com.test.mylibrary.data.model.request.AuthRequest
import com.test.mylibrary.data.model.response.AuthResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface RetrofitApi {
    @GET("ping")
    suspend fun ping() : String

    @POST("auth/authenticate")
    suspend fun authenticate(@Body request: AuthRequest) : Response<AuthResponse>
}