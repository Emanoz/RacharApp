package com.emanoz.racharapp.repositories

import com.emanoz.racharapp.data.local.dao.UsuarioDao
import com.emanoz.racharapp.data.local.entities.UsuarioEntity
import com.emanoz.racharapp.data.model.BaseModel
import com.emanoz.racharapp.data.model.Usuario
import com.emanoz.racharapp.data.network.ApiManager
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class UsuarioRepository(private val usuarioDao: UsuarioDao, val api: ApiManager) : Repository<Usuario> {
    override fun getAllStream(): Flow<List<Usuario>> = usuarioDao.getAll().map { it.map { obj -> obj.asModel() } }

    override suspend fun insert(item: Usuario) {
        usuarioDao.insert(item.asEntity())
    }

    override suspend fun update(item: Usuario) {
        usuarioDao.update(item.asEntity())
    }

    override suspend fun delete(item: Usuario) {
        usuarioDao.delete(item.asEntity())
    }
}