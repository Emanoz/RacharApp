package com.emanoz.racharapp.data.model

import com.emanoz.racharapp.data.local.entities.BaseEntity

interface BaseModel {
    fun asEntity() : BaseEntity
}