package com.emanoz.racharapp.data.model

import com.emanoz.racharapp.data.local.entities.DespesaEntity

data class Despesa (val despesaId: Long,
                    val descricaoDespesa: String,
                    val valorAPagar: Double,
                    val valorInicial: Double,
                    val dataCriacao: Long,
                    val atualizadoEm: Long,
                    val foto: String) : BaseModel {
    override fun asEntity() = DespesaEntity(despesaId, descricaoDespesa, valorAPagar, valorInicial, dataCriacao, atualizadoEm, foto)
}