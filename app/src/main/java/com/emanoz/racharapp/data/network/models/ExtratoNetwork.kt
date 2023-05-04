package com.emanoz.racharapp.data.network.models

import java.io.Serializable

data class ExtratoNetwork (val usuarioId: Long,
                           val grupoId: Long,
                           val despesaId: Long,
                           val valorPaggo: Double,
                           val atualizadoEm: Long) : Serializable