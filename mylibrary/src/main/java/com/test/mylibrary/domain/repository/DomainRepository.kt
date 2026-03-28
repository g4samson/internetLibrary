package com.test.mylibrary.domain.repository

interface DomainRepository {
    suspend fun ping(): String
}