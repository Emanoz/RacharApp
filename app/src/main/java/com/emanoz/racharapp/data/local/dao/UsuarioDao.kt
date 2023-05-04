package com.emanoz.racharapp.data.local.dao

import androidx.room.*
import com.emanoz.racharapp.data.local.entities.UsuarioEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface UsuarioDao {
    @Insert
    suspend fun insert(usuario: UsuarioEntity)

    @Delete
    suspend fun delete(usuario: UsuarioEntity)

    @Update
    suspend fun update(usuario: UsuarioEntity)

    @Query("SELECT * FROM Usuario")
    fun getAll(): Flow<List<UsuarioEntity>>

    @Query("SELECT * FROM Usuario WHERE usuarioId = :id")
    fun getById(id: Long): UsuarioEntity
}