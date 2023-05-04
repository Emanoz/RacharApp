package com.emanoz.racharapp.data.network.models

import java.io.Serializable

data class GrupoNetwork (val grupoId: Long,
                         val descricao: String,
                         val imagem: String,
                         val dataCriacao: Long,
                         val atualizadoEm: Long) : Serializable