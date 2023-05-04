package com.emanoz.racharapp.repositories

import com.emanoz.racharapp.data.local.dao.ExtratoDao
import com.emanoz.racharapp.data.model.Extrato
import com.emanoz.racharapp.data.network.ApiManager
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class ExtratoRepository(val extratoDao: ExtratoDao, api: ApiManager) : Repository<Extrato> {
    override fun getAllStream(): Flow<List<Extrato>> = extratoDao.getAll().map { it.map { obj -> obj.asModel() } }

    override suspend fun insert(item: Extrato) {
        extratoDao.insert(item.asEntity())
    }

    override suspend fun update(item: Extrato) {
        extratoDao.update(item.asEntity())
    }

    override suspend fun delete(item: Extrato) {
        extratoDao.delete(item.asEntity())
    }
}