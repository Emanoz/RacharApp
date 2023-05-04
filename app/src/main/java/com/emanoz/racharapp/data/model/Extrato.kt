package com.emanoz.racharapp.data.model

import com.emanoz.racharapp.data.local.entities.ExtratoEntity

data class Extrato (val usuarioId: Long,
                    val grupoId: Long,
                    val despesaId: Long,
                    val valorPago: Double,
                    val atualizadoEm: Long) : BaseModel {
    override fun asEntity() = ExtratoEntity(usuarioId, grupoId, despesaId, valorPago, atualizadoEm)
}