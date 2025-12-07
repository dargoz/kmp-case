package com.dargoz.di

import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import org.koin.ksp.generated.module


fun featureBModule() = FeatureBModule().module

@ComponentScan("com.dargoz")
@Module(includes = [CommonModule::class])
class FeatureBModule {
}