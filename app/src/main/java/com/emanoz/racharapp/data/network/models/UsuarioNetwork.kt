package com.emanoz.racharapp.data.network.models

import java.io.Serializable

data class UsuarioNetwork (val usuarioId: Long,
                           val nome: String,
                           val telefone: String,
                           val foto: String) : Serializable