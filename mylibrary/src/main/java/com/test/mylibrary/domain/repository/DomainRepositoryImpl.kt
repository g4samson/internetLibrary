package com.test.mylibrary.domain.repository

import com.test.mylibrary.data.utils.Provider
import javax.inject.Inject

class DomainRepositoryImpl @Inject constructor() : DomainRepository {
    val retrofitApi get() = Provider.provideRetrofit()

    override suspend fun ping(): String {
        return retrofitApi.ping()
    }
}