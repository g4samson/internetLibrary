package com.test.mylibrary.domain.repository

import com.test.mylibrary.data.model.request.AuthRequest
import com.test.mylibrary.data.utils.Provider
import javax.inject.Inject

class DomainRepositoryImpl @Inject constructor()
    : DomainRepository {
    val retrofitApi get() = Provider.provideRetrofit()

    override suspend fun ping(): String {
        return retrofitApi.ping()
    }

    override suspend fun authenticate(
        email: String,
        password: String
    ): Result<Int> {
        val request = AuthRequest(email, password)
        val response = retrofitApi.authenticate(request)

        if (response.isSuccessful) return Result.success(response.code())

        return Result.failure(Exception("HTTP ${response.code()}"))
    }
}