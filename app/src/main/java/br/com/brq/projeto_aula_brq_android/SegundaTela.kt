package br.com.brq.projeto_aula_brq_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SegundaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_tela)

        val botao = findViewById<Button>(R.id.botao)

        botao.setOnClickListener(){
            startActivity(Intent(this, TerceiraTela::class.java))
        }


    }
}