package org.kotlinlang.play

fun main() {

    println("Bem vindo ao ByteBank")
    println("===========$$============")

    val alex = Funcionario(nome = "Alex",
            cpf = "111.111.111-12",
            salario = 1000.0)

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salário ${alex.salario}")
    println("bonificação: ${alex.bonificacao()} ")
}

