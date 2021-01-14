package com.codeart.mysimplelogin

import org.koin.dsl.module

val storageModule = module {
    factory {
        SessionManager(get())
    }

    single {
        UserRepository(get())
    }
}
