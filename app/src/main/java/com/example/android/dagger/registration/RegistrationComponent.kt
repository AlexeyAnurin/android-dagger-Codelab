package com.example.android.dagger.registration

import com.example.android.dagger.di.ActivityScope
import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import dagger.Subcomponent

// This Component needs to contain registration specific information.
@ActivityScope
@Subcomponent
interface RegistrationComponent {

    // Factory to create instances of RegistrationComponent.
    @Subcomponent.Factory
    interface Factory {
        fun create(): RegistrationComponent
    }

    // Classes that can be injected by this Component
    //! одна RegistrationViewModel в активити и двух фрагментах.
    fun inject(activity: RegistrationActivity)
    fun inject(fragment: EnterDetailsFragment)
    fun inject(fragment: TermsAndConditionsFragment)
}