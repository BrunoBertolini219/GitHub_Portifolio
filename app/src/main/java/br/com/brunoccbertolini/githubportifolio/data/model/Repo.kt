package br.com.brunoccbertolini.githubportifolio.data.model

data class Repo(
    val id: Int,
    val name: String,
    val description: String,
    val language: String,
    val htmlURL: String,
    val owner: Owner,
    val stargazers_count: Int
)