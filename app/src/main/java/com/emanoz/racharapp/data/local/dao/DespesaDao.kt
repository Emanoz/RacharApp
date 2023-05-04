package com.emanoz.racharapp.data.local.dao

import androidx.room.*
import com.emanoz.racharapp.data.local.entities.DespesaEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface DespesaDao {
    @Insert
    suspend fun insert(despesa: DespesaEntity)

    @Delete
    suspend fun delete(despesa: DespesaEntity)

    @Update
    suspend fun update(despesa: DespesaEntity)

    @Query("SELECT * FROM Despesa")
    fun getAll(): Flow<List<DespesaEntity>>

    @Query("SELECT * FROM Despesa WHERE despesaId = :id")
    fun getById(id: Long): DespesaEntity
}