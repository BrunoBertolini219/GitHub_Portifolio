package br.com.brunoccbertolini.githubportifolio.data.repositories

import br.com.brunoccbertolini.githubportifolio.data.model.Repo
import br.com.brunoccbertolini.githubportifolio.data.services.GitHubService
import kotlinx.coroutines.flow.flow

class RepoRepositoryImpl(private val service: GitHubService) : RepoRepository {

    override suspend fun listRepositories(user: String) = flow {
        val repoList = service.listRepositories(user)
        emit(repoList)
    }
}