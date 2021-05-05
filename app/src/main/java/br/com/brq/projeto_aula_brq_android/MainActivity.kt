package br.com.brq.projeto_aula_brq_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import br.com.brq.projeto_aula_brq_android.OrientaçãoObjeto.Cores.Cor

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        fun pintar(cor: Cor){
            println("Pintar com a cor ${cor}")
        }







        val botao = findViewById<Button>(R.id.botao)

        botao.setOnClickListener(){
            startActivity(Intent(this, SegundaTela::class.java))

        }
    }
}