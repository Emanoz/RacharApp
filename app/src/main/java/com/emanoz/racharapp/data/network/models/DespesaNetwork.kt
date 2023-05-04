package com.emanoz.racharapp.data.network.models

import java.io.Serializable

data class DespesaNetwork (val despesaId: Long,
                           val descricaoDespesa: String,
                           val valorAPagar: Double,
                           val valorInicial: Double,
                           val dataCriacao: Long,
                           val atualizadoEm: Long,
                           val foto: String) : Serializable