package br.com.centauro.viserion

import org.springframework.data.annotation.Id

data class Words(
    @Id
    val id: String,

    val word: String
)