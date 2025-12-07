package com.dargoz

import com.dargoz.usecases.FeatureAUseCase
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

@Suppress("unused")
class FeatureAHelper: KoinComponent {

    fun injectFeatureAUseCase(): FeatureAUseCase {
        val featureAUseCase: FeatureAUseCase by inject()
        return featureAUseCase
    }

}