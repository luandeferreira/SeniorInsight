package br.com.seniorinsight.domain

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class IdosoTest {
    @Test
    fun `deve criar idoso com dados validos`() {
        // Arrange
        val idoso = Idoso(
            id = 1L,
            nome = "Maria Silva",
            cpf = "123.456.789-10",
            idade = 75,
            email = "maria@example.com",
            telefone = "(11) 99999-9999",
            endereco = "Rua das Flores, 123, São Paulo",
            dataDeNascimento = "15/03/1950"
        )


        assertEquals(1L, idoso.id)
        assertEquals("Maria Silva", idoso.nome)
        assertEquals("123.456.789-10", idoso.cpf)
        assertEquals(75, idoso.idade)
        assertEquals("maria@example.com", idoso.email)
        assertEquals("(11) 99999-9999", idoso.telefone)
        assertEquals("Rua das Flores, 123, São Paulo", idoso.endereco)
        assertEquals("15/03/1950", idoso.dataDeNascimento)
    }
}

