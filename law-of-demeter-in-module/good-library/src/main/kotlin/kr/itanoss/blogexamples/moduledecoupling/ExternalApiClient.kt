package kr.itanoss.blogexamples.moduledecoupling

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ExternalApiClient {
    @GET("users/{user}/repos")
    fun listRepos(@Path("user") user: String) : Call<List<Repo>>

}