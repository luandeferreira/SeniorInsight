package br.com.seniorinsight.domain

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RemedioTest {

    @Test
    fun `deve criar remedio com dados validos`() {
        // Arrange
        val remedio = Remedio(
            id = 1L,
            nome = "Paracetamol",
            dosagem = "500mg",
            frequenciaHoras = 8,
            horarioInicio = "08:00",
            observacoes = "Tomar após as refeições",
            idosoId = 1L
        )

        // Assert
        assertEquals(1L, remedio.id)
        assertEquals("Paracetamol", remedio.nome)
        assertEquals("500mg", remedio.dosagem)
        assertEquals(8, remedio.frequenciaHoras)
        assertEquals("08:00", remedio.horarioInicio)
        assertEquals("Tomar após as refeições", remedio.observacoes)
        assertEquals(1L, remedio.idosoId)
    }
}
