package br.com.brq.projeto_aula_brq_android.OrientaçãoObjeto.Vivos

open class Animal: Vivo() {
    open fun sexoMasculino(){}
    open fun sexoFeminino(){}
    open fun caça(){}

    override fun comer() {}
    override fun gastarEnergia() {}
    override fun viver(){}
    override fun morrer(){}
}