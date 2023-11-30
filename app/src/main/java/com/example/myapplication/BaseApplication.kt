package com.example.myapplication

import com.example.myapplication.data.di.component.AppComponent
import com.example.myapplication.data.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication


open class BaseApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return initializeDaggerComponent()
    }

    open fun initializeDaggerComponent(): AppComponent {
        val component: AppComponent = DaggerAppComponent.factory()
            .create(this)

        component.inject(this)

        return component
    }
}