package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.login.LoginComponent
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class, AppSubcomponents::class])
interface AppComponent {

    // Context is provided by the Android system and therefore constructed outside of the graph.
    // Factory to create instances of the AppComponent.
    @Component.Factory // Annotation.
    interface Factory {
        // With @BindsInstance, the Context passed in will be available in the graph.
        fun create(@BindsInstance context: Context): AppComponent
    }

    // Expose RegistrationComponent factory from the graph.
    // Метод создания SubComponent вызывается в родительском компоненте.
    fun registrationComponent(): RegistrationComponent.Factory
    fun loginComponent(): LoginComponent.Factory

    // Classes that can be injected by this Component.
    fun inject(activity: MainActivity)
}