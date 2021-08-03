package br.com.brunoccbertolini.githubportifolio.data.repositories

import br.com.brunoccbertolini.githubportifolio.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}