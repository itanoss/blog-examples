package kr.itanoss.blogexamples.moduledecoupling

class UserController(
        private val repositoryService: RepositoryService
) {

    fun listAllRepositoryNames(username: String): List<String> {
        val response = repositoryService.findRepositories(username)
        check(response.isSuccessful)
        val body = response.body()
        println(body)   // Expose full response instance
        return body?.map { it.name } ?: emptyList() // Additional null-safety handling
    }

}