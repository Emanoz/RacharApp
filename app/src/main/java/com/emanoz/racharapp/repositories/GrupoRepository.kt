package com.emanoz.racharapp.repositories

import com.emanoz.racharapp.data.local.dao.GrupoDao
import com.emanoz.racharapp.data.model.Grupo
import com.emanoz.racharapp.data.network.ApiManager
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GrupoRepository(val grupoDao: GrupoDao, api: ApiManager) : Repository<Grupo> {
    override fun getAllStream(): Flow<List<Grupo>> = grupoDao.getAll().map { it.map { obj -> obj.asModel() } }

    override suspend fun insert(item: Grupo) {
        grupoDao.insert(item.asEntity())
    }

    override suspend fun update(item: Grupo) {
        grupoDao.update(item.asEntity())
    }

    override suspend fun delete(item: Grupo) {
        grupoDao.delete(item.asEntity())
    }
}