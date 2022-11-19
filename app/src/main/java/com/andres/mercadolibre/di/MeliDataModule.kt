package com.andres.mercadolibre.di

import com.andres.mercadolibre.data.remote.MeliApi
import com.andres.mercadolibre.data.repository.MeliRepositoryRemoteImpl
import com.andres.mercadolibre.domain.repository.MeliRepositoryRemote
import com.andres.mercadolibre.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MeliDataModule {

    @Provides
    @Singleton
    fun provideOKHttpClient(): OkHttpClient {
        return OkHttpClient.Builder().addInterceptor(
            HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            }
        ).build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(client: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
    }

    @Provides
    @Singleton
    fun provideMeliApi(retrofit: Retrofit): MeliApi = retrofit.create()

    @Provides
    @Singleton
    fun provideMeliRepositoryRemote(api: MeliApi): MeliRepositoryRemote =
        MeliRepositoryRemoteImpl(api)
}