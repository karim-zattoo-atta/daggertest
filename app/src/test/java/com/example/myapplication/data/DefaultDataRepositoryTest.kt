package com.example.myapplication.data


import com.example.myapplication.TestBaseApplication
import com.example.myapplication.data.remote.model.Repo
import com.example.myapplication.data.remote.model.RepoSearchResponse
import com.example.myapplication.di.component.DaggerTestAppComponent
import com.example.myapplication.di.component.TestAppComponent
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.verify
import javax.inject.Inject
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.isActive
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test

class DefaultDataRepositoryTest {

    @Inject
    lateinit var dataRepository: DefaultDataRepository

    @Before
    fun setup() {
        val component: TestAppComponent = DaggerTestAppComponent.factory()
            .create(TestBaseApplication())
        component.inject(this)
    }

    @ExperimentalCoroutinesApi
    @Test
    fun getSearchResponse() = runTest {


        val response = dataRepository.getSearchResponse("android", 1, 10)
        if (response is Result.Success) {
            assert(response.data.items.isNotEmpty())
        }
    }
}