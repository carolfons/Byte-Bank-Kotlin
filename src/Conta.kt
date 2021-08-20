package org.kotlinlang.play

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