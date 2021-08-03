package br.com.brunoccbertolini.githubportifolio.data.services

import br.com.brunoccbertolini.githubportifolio.data.model.Repo
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET
import retrofit2.http.Path


interface GitHubService {

    @GET("users/{user}/repos")
   suspend fun listRepositories (@Path("user") user: String?): List<Repo>
}