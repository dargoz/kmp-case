package com.dargoz.usecases

import com.dargoz.data.Repository
import org.koin.core.annotation.Single

@Single
class FeatureAUseCase(private val repository: Repository) {

    operator fun invoke(): String {
        return repository.getData()
    }
}