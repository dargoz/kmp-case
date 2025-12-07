package com.dargoz

import com.dargoz.usecases.FeatureBUseCase
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

@Suppress("unused")
class FeatureBHelper: KoinComponent {

    fun injectFeatureBUseCase(): FeatureBUseCase {
        val featureBUseCase: FeatureBUseCase by inject()
        return featureBUseCase
    }

}