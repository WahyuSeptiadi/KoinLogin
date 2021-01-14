package com.codeart.mysimplelogin

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * Supaya Anda bisa menggunakan Koin di semua kelas, Anda dapat membuat Custom Application untuk
 * memanggil Koin. Kelas ini akan dijadikan sebagai base Application dengan menambahkan name pada
 * AndroidManifest. (Sementara class dibawah ini tidak digunakan)
 **/

open class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication)
            modules(storageModule)
        }
    }
}

