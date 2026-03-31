package com.test.mylibrary.domain.repository

interface DomainRepository {
    suspend fun ping(): String

    suspend fun authenticate(email: String, password: String) : Result<Int>
}