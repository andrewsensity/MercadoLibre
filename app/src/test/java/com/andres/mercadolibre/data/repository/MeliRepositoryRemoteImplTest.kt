package com.andres.mercadolibre.data.repository

import com.andres.mercadolibre.data.remote.MeliApi
import com.andres.mercadolibre.util.Util.readJsonFile
import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.runBlocking
import okhttp3.OkHttpClient
import okhttp3.mockwebserver.MockResponse
import org.junit.After
import org.junit.Before
import org.junit.Test
import okhttp3.mockwebserver.MockWebServer
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit
import retrofit2.converter.moshi.MoshiConverterFactory

class MeliRepositoryRemoteImplTest {

    private lateinit var meliRepositoryRemoteImpl: MeliRepositoryRemoteImpl
    private lateinit var meliApi: MeliApi
    private lateinit var mockWebServer: MockWebServer
    private lateinit var okHttpClient: OkHttpClient

    @Before
    fun setUp() {
        mockWebServer = MockWebServer()
        okHttpClient = OkHttpClient.Builder()
            .writeTimeout(1, TimeUnit.SECONDS)
            .readTimeout(1, TimeUnit.SECONDS)
            .connectTimeout(1, TimeUnit.SECONDS)
            .build()
        meliApi = Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .client(okHttpClient)
            .baseUrl(mockWebServer.url("/"))
            .build()
            .create(MeliApi::class.java)

        meliRepositoryRemoteImpl = MeliRepositoryRemoteImpl(api = meliApi)
    }

    @After
    fun tearDown() {
        mockWebServer.shutdown()
    }

    @Test
    fun `getBySearch, valid response, returns success`() = runBlocking {
        mockWebServer.enqueue(
            MockResponse()
                .setResponseCode(200)
                .setBody(readJsonFile("response_get_by_search.json"))
        )
        val result = meliRepositoryRemoteImpl.getBySearch(
            product = "carro"
        )
        assertThat(result.isSuccess).isTrue()
    }

    @Test
    fun `getBySearch, invalid response, returns failure`() = runBlocking {
        mockWebServer.enqueue(
            MockResponse()
                .setResponseCode(400)
                .setBody(readJsonFile("response_get_by_search.json"))
        )
        val result = meliRepositoryRemoteImpl.getBySearch(
            product = "carro"
        )
        assertThat(result.isFailure).isTrue()
    }

    @Test
    fun `getBySearch, malformed response, returns failure`() = runBlocking {
        mockWebServer.enqueue(
            MockResponse()
                .setBody(malformedGetBySearch)
        )
        val result = meliRepositoryRemoteImpl.getBySearch(
            product = "carro"
        )
        assertThat(result.isFailure).isTrue()
    }

    @Test
    fun `getDetails, valid response, returns success`() = runBlocking {
        mockWebServer.enqueue(
            MockResponse()
                .setResponseCode(200)
                .setBody(readJsonFile("response_get_details.json"))
        )
        val result = meliRepositoryRemoteImpl.getDetails(id = "MCO578617981")
        assertThat(result.isSuccess).isTrue()
    }

    @Test
    fun `getDetails, invalid response, returns failure`() = runBlocking {
        mockWebServer.enqueue(
            MockResponse()
                .setResponseCode(400)
                .setBody(readJsonFile("response_get_details.json"))
        )
        val result = meliRepositoryRemoteImpl.getDetails(id = "MCO578617981")
        assertThat(result.isFailure).isTrue()
    }

    @Test
    fun `getDetails, malformed response, returns failure`() = runBlocking {
        mockWebServer.enqueue(
            MockResponse()
                .setBody(malformedGetDetails)
        )
        val result = meliRepositoryRemoteImpl.getDetails(id = "MCO578617981")
        assertThat(result.isFailure).isTrue()
    }

    @Test
    fun `getDescription, valid response, returns success`() = runBlocking {
        mockWebServer.enqueue(
            MockResponse()
                .setResponseCode(200)
                .setBody(readJsonFile("response_get_description.json"))
        )
        val result = meliRepositoryRemoteImpl.getDescription(id = "MCO578617981")
        assertThat(result.isSuccess).isTrue()
    }

    @Test
    fun `getDescription, invalid response, returns failure`() = runBlocking {
        mockWebServer.enqueue(
            MockResponse()
                .setResponseCode(400)
                .setBody(readJsonFile("response_get_description.json"))
        )
        val result = meliRepositoryRemoteImpl.getDescription(id = "MCO578617981")
        assertThat(result.isFailure).isTrue()
    }

    @Test
    fun `getDescription, malformed response, returns failure`() = runBlocking {
        mockWebServer.enqueue(
            MockResponse()
                .setBody(malformedGeDescription)
        )
        val result = meliRepositoryRemoteImpl.getDescription(id = "MCO578617981")
        assertThat(result.isFailure).isTrue()
    }

    @Test
    fun `getCategories, valid response, returns success`() = runBlocking {
        mockWebServer.enqueue(
            MockResponse()
                .setResponseCode(200)
                .setBody(readJsonFile("response_get_categories.json"))
        )
        val result = meliRepositoryRemoteImpl.getCategories()
        assertThat(result.isSuccess).isTrue()
    }

    @Test
    fun `getCategories, invalid response, returns failure`() = runBlocking {
        mockWebServer.enqueue(
            MockResponse()
                .setResponseCode(400)
                .setBody(readJsonFile("response_get_categories.json"))
        )
        val result = meliRepositoryRemoteImpl.getCategories()
        assertThat(result.isFailure).isTrue()
    }

    @Test
    fun `getCategories, malformed response, returns failure`() = runBlocking {
        mockWebServer.enqueue(
            MockResponse()
                .setBody(malformedGetCategories)
        )
        val result = meliRepositoryRemoteImpl.getCategories()
        assertThat(result.isFailure).isTrue()
    }
}