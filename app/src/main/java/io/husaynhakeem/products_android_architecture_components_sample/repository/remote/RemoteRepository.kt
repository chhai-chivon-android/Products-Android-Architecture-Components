/*
 * Copyright (c) 2018 HusaynHakeem.
 */

package io.husaynhakeem.products_android_architecture_components_sample.repository.remote

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import io.husaynhakeem.products_android_architecture_components_sample.repository.BaseRepository
import io.husaynhakeem.products_android_architecture_components_sample.repository.local.Product

class RemoteRepository : BaseRepository {

    override fun getProducts(): LiveData<Product> {
        return MutableLiveData()
    }
}