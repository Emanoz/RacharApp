package com.emanoz.racharapp.data.local.dao

import androidx.room.*
import com.emanoz.racharapp.data.local.entities.GrupoEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface GrupoDao {
    @Insert
    suspend fun insert(grupo: GrupoEntity)

    @Delete
    suspend fun delete(grupo: GrupoEntity)

    @Update
    suspend fun update(grupo: GrupoEntity)

    @Query("SELECT * FROM Grupo")
    fun getAll(): Flow<List<GrupoEntity>>

    @Query("SELECT * FROM Grupo WHERE grupoId = :id")
    fun getById(id: Long): GrupoEntity
}