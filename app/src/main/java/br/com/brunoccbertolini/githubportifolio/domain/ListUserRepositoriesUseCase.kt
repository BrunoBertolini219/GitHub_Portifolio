package br.com.brunoccbertolini.githubportifolio.domain

import br.com.brunoccbertolini.githubportifolio.core.UseCase
import br.com.brunoccbertolini.githubportifolio.data.model.Repo
import br.com.brunoccbertolini.githubportifolio.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
    ) : UseCase<String, List<Repo>>() {
    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}