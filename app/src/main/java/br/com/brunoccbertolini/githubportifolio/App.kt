package br.com.brunoccbertolini.githubportifolio

import android.app.Application
import br.com.brunoccbertolini.githubportifolio.data.di.DataModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidContext(this@App)
        }
        DataModule.load()
    }

}