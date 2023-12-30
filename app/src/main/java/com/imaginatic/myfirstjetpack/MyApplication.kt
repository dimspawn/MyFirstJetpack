package com.imaginatic.myfirstjetpack

import android.app.Application
import com.imaginatic.myfirstjetpack.di.AppComponent
import com.imaginatic.myfirstjetpack.di.DaggerAppComponent
import com.myfirstjetpack.core.di.DaggerCoreComponent

open class MyApplication: Application() {
    private val coreComponent by lazy {
        DaggerCoreComponent.builder().context(this).build()
    }

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder().coreComponent(coreComponent).build()
    }
}