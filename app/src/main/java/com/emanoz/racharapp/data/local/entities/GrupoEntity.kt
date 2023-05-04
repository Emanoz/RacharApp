package com.emanoz.racharapp.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.emanoz.racharapp.data.model.Grupo

@Entity(tableName = "Grupo")
data class GrupoEntity (
    @PrimaryKey(autoGenerate = true) val grupoId: Long,
    val descricao: String,
    val imagem: String,
    val dataCriacao: Long,
    val atualizadoEm: Long
) : BaseEntity {
    override fun asModel() = Grupo(grupoId, descricao, imagem, dataCriacao, atualizadoEm)
}