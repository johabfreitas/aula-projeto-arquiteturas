package br.com.johabfreitas.aulaprojetoarquiteturas.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.johabfreitas.aulaprojetoarquiteturas.R
import br.com.johabfreitas.aulaprojetoarquiteturas.controller.UsuarioController
import br.com.johabfreitas.aulaprojetoarquiteturas.databinding.ActivityMainBinding
import br.com.johabfreitas.aulaprojetoarquiteturas.model.Usuario

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private lateinit var usuarioController: UsuarioController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        usuarioController = UsuarioController(
            this
        )
        //usuarioController.recuperarUsuarios()//Forma Ativa
        binding.btnRecuperar.setOnClickListener {
            usuarioController.recuperarUsuarios()
        }
    }

    //Passiva
    fun listarUsuarios(lista: List<Usuario>){

        var textoUsuarios = ""
        lista.forEach{usuario ->
            textoUsuarios += "${usuario.nome} - ${usuario.idade} \n"
        }

        binding.textResultado.text = textoUsuarios
    }

}

/**
* Introdução à arquitetura MVC(Model, View e Controller)
* Testável(mais fácil para testar);
* Extensível(Organizar melhor o código);
* Escalável(Melhor crescimento do software);
* Sustentável(Manutenção mais fácil)
* */

/**
* Evolução das arquiteturas
 * MVC(Forma padrão no Android)
 * * Criado na década de 70, como forma de separar lógica de apresentação da lógica de negócio,
 * * diminuindo o acoplamento entre as classes.
 * * Paralelização do desenvolvimento(Cada pessoa e/ou grupo trabalhando em um módulo da aplicação)
 * * Reuso de código
 *
 * O MVC trabalha na divisão de responsabilidades, exemplo, uma camada model não pode ser responsável pela view e vice versa,
 * dessa forma não exite mais arquitetura em uma aplicação.
 *
 * MVP(Usado em muitos projetos)
 * MVVM(Mais recomendada e pedidas em vagas atualmente)
* */