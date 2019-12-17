package kr.itanoss.blogexamples.moduledecoupling

import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.create

class RepositoryService(
        private val baseUrl: String
) {
    private val apiClient: ExternalApiClient

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl(baseUrl)
                .build()
        apiClient = retrofit.create()
    }

    fun findRepositories(username: String): List<Repo> {  // Centric to client's interest
        val call = apiClient.listRepos(username)
        with(call.execute()) {
            if (isSuccessful) return body() ?: emptyList()
            throw IllegalStateException(errorBody()?.string())
        }
    }
}