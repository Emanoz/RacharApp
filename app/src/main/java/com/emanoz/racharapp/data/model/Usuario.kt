package com.emanoz.racharapp.data.model

import com.emanoz.racharapp.data.local.entities.BaseEntity
import com.emanoz.racharapp.data.local.entities.UsuarioEntity

data class Usuario (val usuarioId: Long,
                    val nome: String,
                    val telefone: String,
                    val foto: String) : BaseModel {
    override fun asEntity() = UsuarioEntity(usuarioId, nome, telefone, foto)
}