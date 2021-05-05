package br.com.brq.projeto_aula_brq_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import br.com.brq.projeto_aula_brq_android.OrientaçãoObjeto.Animais.Animal
import br.com.brq.projeto_aula_brq_android.OrientaçãoObjeto.Animais.Cachorro
import br.com.brq.projeto_aula_brq_android.OrientaçãoObjeto.Cores.Azul
import br.com.brq.projeto_aula_brq_android.OrientaçãoObjeto.Cores.Cor

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val corAzul = Azul(nome = "Azul Escuro")
        pintar(corAzul)


        val cachorro = Cachorro("Kotlin", 4, true, "Pug", 12.59f)
        selecionarAnimal(cachorro)



//        val botao = findViewById<Button>(R.id.botao)
//
//        botao.setOnClickListener(){
//            startActivity(Intent(this, SegundaTela::class.java))
//        }
    }

    fun pintar(cor: Cor){
        println("Pintar com a cor ${cor.nome}")
    }

    fun selecionarAnimal(animal: Animal) {
        println("Selecionar ${animal.nome}")
    }
}