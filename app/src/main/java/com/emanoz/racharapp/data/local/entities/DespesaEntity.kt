package com.emanoz.racharapp.data.local.entities

import androidx.room.PrimaryKey
import androidx.room.Entity
import com.emanoz.racharapp.data.model.Despesa

// Despesa individual - apenas um item que pode estar associado a um grupo de despesas
@Entity(tableName = "Despesa")
data class DespesaEntity (
    @PrimaryKey(autoGenerate = true) val despesaId: Long,
    val descricaoDespesa: String,
    val valorAPagar: Double,
    val valorInicial: Double,
    val dataCriacao: Long,
    val atualizadoEm: Long,
    val foto: String = "",
) : BaseEntity {
    override fun asModel() = Despesa(despesaId, descricaoDespesa, valorAPagar, valorInicial, dataCriacao, atualizadoEm, foto)
}