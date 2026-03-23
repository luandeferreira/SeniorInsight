package br.com.seniorinsight.domain

data class Turno(
    val id: Long,
    val nome: String, // Ex: "Manhã", "Tarde", "Noite"
    val horaInicio: String, // Ex: "06:00"
    val horaFim: String // Ex: "12:00"
)