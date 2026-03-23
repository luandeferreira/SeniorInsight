package br.com.seniorinsight.domain

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TurnoTest {

    @Test
    fun `deve criar turno com dados validos`() {
        val turno = Turno(
            id = 1L,
            nome = "Manhã",
            horaInicio = "06:00",
            horaFim = "12:00"
        )

        assertEquals(1L, turno.id)
        assertEquals("Manhã", turno.nome)
        assertEquals("06:00", turno.horaInicio)
        assertEquals("12:00", turno.horaFim)
    }
}
