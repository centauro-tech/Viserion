package br.com.centauro.viserion.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Words(
        @Id
        val id: String,

        val word: String
)