package br.com.brunoccbertolini.githubportifolio

import android.app.Application
import br.com.brunoccbertolini.githubportifolio.data.di.DataModule
import br.com.brunoccbertolini.githubportifolio.domain.di.DomainModule
import br.com.brunoccbertolini.githubportifolio.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidContext(this@App)
        }
        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }

}