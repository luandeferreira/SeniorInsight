package br.com.seniorinsight.data

import br.com.seniorinsight.domain.Usuario

interface UsuarioRepository {
    fun salvar(usuario: Usuario): Boolean
    fun obter(id: Long): Usuario?
    fun listar(): List<Usuario>
    fun deletar(id: Long): Boolean
}

