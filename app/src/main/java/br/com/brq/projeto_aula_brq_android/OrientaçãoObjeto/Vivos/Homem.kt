package br.com.brq.projeto_aula_brq_android.OrientaçãoObjeto.Vivos

class Homem(): Humano() {
    open fun força(){}

    override fun sexoMasculino() {}

    override fun comer() {}
    override fun gastarEnergia() {}
    override fun viver(){}
    override fun morrer(){}
}