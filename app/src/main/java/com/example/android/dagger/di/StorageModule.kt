package com.example.android.dagger.di

import com.example.android.dagger.storage.SharedPreferencesStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module

@Module
// StorageModule is abstract now because the provideStorage is abstract.
abstract class StorageModule {

    // Makes Dagger provide SharedPreferencesStorage when a Storage type is requested.
    @Binds
    // arbitrary method name
    abstract fun provideStorage(storage: SharedPreferencesStorage): Storage
}
