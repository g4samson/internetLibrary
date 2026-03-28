package com.test.mylibrary.data.utils

//import dagger.Module
//import dagger.Provides
//import dagger.hilt.InstallIn
//import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

//@Module
//@InstallIn(SingletonComponent::class)
object Provider {

//    @Provides
    fun provideRetrofit(): RetrofitApi {
        return Retrofit.Builder()
            .baseUrl("https://adt.rss14.ru/api/v1/")
            .addConverterFactory(ScalarsConverterFactory.create())
            .build()
            .create(RetrofitApi::class.java)
    }
}