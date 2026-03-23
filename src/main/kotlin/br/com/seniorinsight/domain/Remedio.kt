package br.com.seniorinsight.domain


data class Remedio(
    val id: Long,
    val nome: String,
    val dosagem: String, // Ex: "500mg"
    val frequenciaHoras: Int, // Ex: a cada 8h
    val horarioInicio: String, // Ex: "08:00"
    val observacoes: String? = null,
    val idosoId: Long
)