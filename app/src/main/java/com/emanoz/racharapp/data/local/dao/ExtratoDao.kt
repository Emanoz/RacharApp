package com.emanoz.racharapp.data.local.dao

import androidx.room.*
import com.emanoz.racharapp.data.local.entities.ExtratoEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ExtratoDao {
    @Insert
    suspend fun insert(extrato: ExtratoEntity)

    @Delete
    suspend fun delete(extrato: ExtratoEntity)

    @Update
    suspend fun update(extrato: ExtratoEntity)

    @Query("SELECT * FROM Extrato")
    fun getAll(): Flow<List<ExtratoEntity>>

    @Query("SELECT * FROM Extrato WHERE usuarioId = :usuarioId AND despesaId = :despesaId AND grupoId = :grupoId")
    fun getByIds(usuarioId: Long, despesaId: Long, grupoId: Long): ExtratoEntity
}