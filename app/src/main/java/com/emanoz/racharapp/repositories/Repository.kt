package com.emanoz.racharapp.repositories

import com.emanoz.racharapp.data.model.BaseModel
import kotlinx.coroutines.flow.Flow

interface Repository<T : BaseModel> {
    fun getAllStream() : Flow<List<BaseModel>>
    suspend fun insert(item: T)
    suspend fun update(item: T)
    suspend fun delete(item: T)
}