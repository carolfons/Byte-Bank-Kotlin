package org.kotlinlang.play

fun testaComportamentosConta() {
    val c1 = Conta("Alex", 1000)
    val c2 = Conta("Fran", 1001)

    //conta 1
    c1.deposita(200.0)

    //conta 2
    c2.deposita(300.0)

    //saída de dados
    println("Conta de número ${c1.numero} pertence a ${c1.titular} possui o saldo de ${c1.saldo} reais")
    println("Conta de número ${c2.numero} pertence a ${c2.titular} possui o saldo de ${c2.saldo} reais")
    println()

    /*Testando as
    Funções* */

    var flag = true

    while (flag) {


        println("1 - DEPOSITAR")
        println("2 - SACAR")
        println("3 - TRANSFERIR")
        println("4 - SAIR")

        var inp = readLine()

        if (inp == "1") {
            c1.deposita(50.0)
            c2.deposita(50.0)


        } else if (inp == "2") {

            c1.saca(100.0)
            c2.saca(500.0)

        } else if (inp == "3") {
            if (c2.transfere(40.0, c1)) {
                println("Transferência efetuada com sucesso!")
                println()
            } else {
                println("Falha na transferência!")
            }
        } else {
            flag = false
        }
    }
}