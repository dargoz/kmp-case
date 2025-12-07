package com.dargoz

import org.koin.core.component.KoinComponent
import org.koin.core.context.startKoin
import org.koin.core.module.Module

@Suppress("unused")
class KoinHelper: KoinComponent {

    fun initKoinModules(modules: List<Module>) {
        startKoin {
            modules(modules)
        }
    }
}