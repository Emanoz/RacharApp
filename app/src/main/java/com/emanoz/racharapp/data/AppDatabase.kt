package com.emanoz.racharapp.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.emanoz.racharapp.data.local.dao.DespesaDao
import com.emanoz.racharapp.data.local.dao.ExtratoDao
import com.emanoz.racharapp.data.local.dao.GrupoDao
import com.emanoz.racharapp.data.local.dao.UsuarioDao
import com.emanoz.racharapp.data.local.entities.DespesaEntity
import com.emanoz.racharapp.data.local.entities.ExtratoEntity
import com.emanoz.racharapp.data.local.entities.GrupoEntity
import com.emanoz.racharapp.data.local.entities.UsuarioEntity

@Database(entities = [UsuarioEntity::class, ExtratoEntity::class, DespesaEntity::class, GrupoEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    companion object {
        lateinit var dbInstance: AppDatabase
    }

    fun initializeDatabase(applicationContext: Context) {
        dbInstance = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "rachar-db"
        ).build()
    }

    // Inserir a assinatura dos métodos das classes DAO
    abstract fun usuarioDao(): UsuarioDao
    abstract fun despesaDao(): DespesaDao
    abstract fun grupoDao(): GrupoDao
    abstract fun extratoDao(): ExtratoDao
}