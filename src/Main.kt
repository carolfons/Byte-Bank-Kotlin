package org.kotlinlang.play

fun main() {

    println("Bem vindo ao ByteBank")
    println("===========$$============")

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

    while(flag) {


        println("1 - DEPOSITAR")
        println("2 - SACAR")
        println("3 - TRANSFERIR")
        println("4 - SAIR")

        var inp = readLine()

        if (inp == "1") {
            c1.deposita(50.0)
            c2.deposita(50.0)


        } else if(inp == "2") {

            c1.saca(100.0)
            c2.saca(500.0)

        }else if (inp == "3"){
            if(c2.transfere(40.0,c1)){
                println("Transferência efetuada com sucesso!")
                println()
            }
            else{
                println("Falha na transferência!")
            }
        }else{
            flag = false
        }
    }

}


class Conta(var titular:String, val numero: Int) { //construtor primário, onde ja é possível declarar a variável
     var saldo = 0.0
        private set //setter privado apenas a própria classe altera seu valor diretamente

    //método para depositar
    fun deposita(valor: Double) {
        println("Depositando na conta do titular ${this.titular} a quantia de $valor reais")
        val valorAntigo = this.saldo
        this.saldo += valor
        println("Saldo Inicial: $valorAntigo")
        println("Saldo Final: ${this.saldo} reais")
        println()
    }


    //método para sacar
    fun saca(valor: Double) {
        if (saldo >= valor) {
            println("Sacando na conta do titular: ${this.titular}")
            println("Quantidade Sacada: $valor")
            val valorAntigo = this.saldo
            this.saldo -= valor
            println("Saldo Inicial: $valorAntigo")
            println("Saldo Final: ${this.saldo}")
            println()
        } else {
            println("Sacando na conta do titular: ${this.titular}")
            println("Quantidade Sacada: $valor")
            println("Erro! Valor de saque maior que saldo!")
            println("Saldo da conta: ${this.saldo}")
            println("Valor: $valor")
            println()
        }
    }

    //métoda para transferir
    fun transfere(valor: Double, destino: Conta): Boolean {

        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            println("Transferindo valor de $valor reais ")
            println("Origem: Conta ${this.titular}")
            println("Destino: Conta ${destino.titular}")
            println()
            return true
        } else {
            return false
        }
    }

    /*
      //getter e setters
     fun getSaldo():Double{
        return saldo
    }
    fun setSaldo(d: Double): Double {
        return d
    }
    * */





}

