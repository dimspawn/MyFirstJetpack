package com.imaginatic.myfirstjetpack.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.imaginatic.myfirstjetpack.MainViewModel
import com.myfirstjetpack.core.di.ViewModelKey
import com.myfirstjetpack.core.ui.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Suppress("unused")
@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(viewModel: MainViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}