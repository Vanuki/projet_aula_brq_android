package br.com.brq.projeto_aula_brq_android.OrientaçãoObjeto.Vivos

open class Humano(): Vivo() {
    open fun sexoMasculino(){}
    open fun sexoFeminino(){}

    override fun comer() {}
    override fun gastarEnergia() {}
    override fun viver(){}
    override fun morrer(){}
}