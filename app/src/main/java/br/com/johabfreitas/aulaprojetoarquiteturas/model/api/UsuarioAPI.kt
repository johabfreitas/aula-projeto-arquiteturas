package br.com.johabfreitas.aulaprojetoarquiteturas.model.api

import br.com.johabfreitas.aulaprojetoarquiteturas.model.Usuario

class UsuarioAPI {

    fun recuperarUsuarios() : List<Usuario>{

        val listaUsuario = listOf(
            Usuario("Johab", 37),
            Usuario("Daniele", 39),
            Usuario("Hannah", 9),
            Usuario("Daniel", 14),
            Usuario("Gustavo", 12)
        )

        return listaUsuario

    }
}