package br.com.johabfreitas.aulaprojetoarquiteturas.controller

import br.com.johabfreitas.aulaprojetoarquiteturas.model.Usuario
import br.com.johabfreitas.aulaprojetoarquiteturas.model.api.UsuarioAPI
import br.com.johabfreitas.aulaprojetoarquiteturas.view.MainActivity

class UsuarioController (
    private val mainActivity: MainActivity
){

    private val usuarioAPI = UsuarioAPI()

    /*fun recuperarUsuarios(): List<Usuario> {

        //1) Regra de negócio
        val lista = usuarioAPI.recuperarUsuarios()

        //2)Exibir os dados na interface
        return lista
    }*/

    init {
        recuperarUsuarios()
    }

    fun recuperarUsuarios(){

        //1) Regra de negócio
        val lista = usuarioAPI.recuperarUsuarios()

        //2)Exibir os dados na interface
        mainActivity.listarUsuarios(lista)
    }
}