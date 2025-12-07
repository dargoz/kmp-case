package com.dargoz.data

import org.koin.core.annotation.Single

@Single
class RepositoryImpl: Repository {
    override fun getData(): String {
        return "common data"
    }
}