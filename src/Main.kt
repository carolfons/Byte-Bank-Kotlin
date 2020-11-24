package org.kotlinlang.play
fun main() {

    println("Bem vindo ao ByteBank")
    println()

    val c1 = Conta()
    val c2 = Conta()

    //conta 1
    c1.titular = "Alex"
    c1.numero = 1000
    c1.saldo = 100.0

    //conta 2
    c2.titular = "Fran"
    c2.numero = 1001
    c2.saldo = 200.0

    //saída de dados
    println("Conta de número ${c1.numero} pertence a ${c1.titular} possui o saldo de ${c1.saldo} reais")
    println("Conta de número ${c2.numero} pertence a ${c2.titular} possui o saldo de ${c2.saldo} reais")

   //depositando conta 1
    deposita(c1, 50.0)
    deposita(c2,70.0)

}


}


class Conta{
    var titular = ""
    var numero = 0
    var saldo = 0.0
    
    fun deposita(conta:Conta,valor:Double){
        println("Depositando na conta do titular ${conta.titular} a quantia de $valor reais")
        val valorAntigo = conta.saldo
        conta.saldo+=valor
        println("Saldo Inicial: $valorAntigo")
        println("Saldo Final: ${conta.saldo} reais")
}

