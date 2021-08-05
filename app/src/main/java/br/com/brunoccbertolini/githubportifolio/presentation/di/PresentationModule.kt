package br.com.brunoccbertolini.githubportifolio.presentation.di

import br.com.brunoccbertolini.githubportifolio.domain.ListUserRepositoriesUseCase
import br.com.brunoccbertolini.githubportifolio.presentation.MainViewModel
import org.koin.androidx.experimental.dsl.viewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.androidx.viewmodel.scope.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object PresentationModule {

    fun load(){
        loadKoinModules(viewModelModule())
    }

    private fun viewModelModule(): Module {
        return module {
               viewModel {MainViewModel(get())}

        }
    }

}