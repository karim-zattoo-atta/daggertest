package com.example.myapplication

import com.example.myapplication.data.di.component.AppComponent
import com.example.myapplication.di.component.DaggerTestAppComponent
import com.example.myapplication.di.component.TestAppComponent

class TestBaseApplication : BaseApplication() {

    override fun initializeDaggerComponent(): AppComponent {
        val component: TestAppComponent = DaggerTestAppComponent.factory()
            .create(this)

        component.inject(this)

        return component
    }

}