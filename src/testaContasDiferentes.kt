package org.kotlinlang.play

 fun testaContasDiferentes() {
    println("Bem vindo ao ByteBank")
    println("===========$$============")

//  crinado conta corrente
    val contaCorrente = ContaCorrente(
            titular = "Alex",
            numero = 1000)
//  criando conta poupança
    val contaPoupanca = ContaPoupanca(
            titular = "Fran",
            numero = 1001
    )
//  deposito
    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    println("--------------------------")
//  saque
    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    println("----------------------")
    contaCorrente.transfere(100.0, contaPoupanca)
    contaPoupanca.transfere(100.0, contaCorrente)
}