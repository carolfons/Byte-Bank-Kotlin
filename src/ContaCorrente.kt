package org.kotlinlang.play

class ContaCorrente(
        titular: String,
        numero: Int) : Conta(
        titular,
        numero
) {

    override fun saca(valor: Double){
        val valorComTaxa = valor +0.20
        if(this.saldo >= valorComTaxa){
            this.saldo -= valorComTaxa
        }
    }


}