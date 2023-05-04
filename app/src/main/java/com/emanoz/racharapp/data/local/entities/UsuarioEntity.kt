package com.emanoz.racharapp.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.emanoz.racharapp.data.model.Usuario

@Entity(tableName = "Usuario")
data class UsuarioEntity (
    @PrimaryKey(autoGenerate = true) val usuarioId: Long,
    val nome: String,
    val telefone: String,
    val foto: String = "",
) : BaseEntity {
    override fun asModel() = Usuario(usuarioId, nome, telefone, foto)
}