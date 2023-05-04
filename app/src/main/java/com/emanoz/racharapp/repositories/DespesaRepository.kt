package com.emanoz.racharapp.repositories

import com.emanoz.racharapp.data.local.dao.DespesaDao
import com.emanoz.racharapp.data.model.Despesa
import com.emanoz.racharapp.data.network.ApiManager
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class DespesaRepository(val despesaDao: DespesaDao, api: ApiManager) : Repository<Despesa> {
    override fun getAllStream(): Flow<List<Despesa>> = despesaDao.getAll().map { it.map { obj -> obj.asModel() } }

    override suspend fun insert(item: Despesa) {
        despesaDao.insert(item.asEntity())
    }

    override suspend fun update(item: Despesa) {
        despesaDao.update(item.asEntity())
    }

    override suspend fun delete(item: Despesa) {
        despesaDao.delete(item.asEntity())
    }
}