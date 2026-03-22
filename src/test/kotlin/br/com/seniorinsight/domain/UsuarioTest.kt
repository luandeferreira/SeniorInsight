package br.com.seniorinsight.domain
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
class UsuarioTest {
    @Test
    fun `deve criar usuario com dados validos`() {
        // Arrange
        val usuario = Usuario(
            id = 1L,
            nome = "João Silva",
            email = "joao@example.com",
            idade = 65
        )
        // Act & Assert
        assertEquals(1L, usuario.id)
        assertEquals("João Silva", usuario.nome)
        assertEquals("joao@example.com", usuario.email)
        assertEquals(65, usuario.idade)
    }
}
