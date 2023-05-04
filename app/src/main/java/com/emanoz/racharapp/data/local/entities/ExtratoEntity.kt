package com.emanoz.racharapp.data.local.entities

import androidx.room.Entity
import com.emanoz.racharapp.data.model.Extrato

// Grupo de despesas associadas a um ou vários usuários
@Entity(tableName = "Extrato", primaryKeys = ["usuarioId", "despesaId", "grupoId"])
data class ExtratoEntity (
    val usuarioId: Long,
    val despesaId: Long,
    val grupoId: Long,
    val valorPago: Double,
    val atualizadoEm: Long
) : BaseEntity {
    override fun asModel() = Extrato(usuarioId, despesaId, grupoId, valorPago, atualizadoEm)
}