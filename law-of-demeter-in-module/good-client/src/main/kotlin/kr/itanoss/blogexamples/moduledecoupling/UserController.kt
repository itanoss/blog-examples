package kr.itanoss.blogexamples.moduledecoupling

class UserController(
        private val repositoryService: RepositoryService
) {

    fun listAllRepositoryNames(username: String): List<String> {
        val repositories = repositoryService.findRepositories(username)
        println(repositories)
        return repositories.map { it.name }     // So concise! :)
    }

}