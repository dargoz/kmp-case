package com.dargoz.di

import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import org.koin.ksp.generated.module

fun commonModule() = CommonModule().module

@Module
@ComponentScan("com.dargoz")
class CommonModule {
}