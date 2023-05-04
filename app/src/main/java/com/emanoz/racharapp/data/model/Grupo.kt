package com.emanoz.racharapp.data.model

import com.emanoz.racharapp.data.local.entities.GrupoEntity

data class Grupo (val grupoId: Long,
                  val descricao: String,
                  val imagem: String,
                  val dataCriacao: Long,
                  val atualizadoEm: Long) : BaseModel {
    override fun asEntity() = GrupoEntity(grupoId, descricao, imagem, dataCriacao, atualizadoEm)
}