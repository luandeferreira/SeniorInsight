package br.com.seniorinsight.domain

data class Idoso(
    val id: Long,
    val nome: String,
    val cpf: String,
    val idade: Int,
    val email: String,
    val telefone: String,
    val endereco: String,
    val dataDeNascimento: String
)

