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

    fun findRepositories(username: String): Response<List<Repo>> {  // Exposed to the client!
        val call = apiClient.listRepos(username)
        return call.execute()
    }
}