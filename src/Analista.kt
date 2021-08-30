package org.kotlinlang.play

class Analista(
        nome:String,
        cpf:String,
        salario:Double

):Funcionario( //gerente herda da classe de funcionários
        nome = nome,
        cpf = cpf,
        salario = salario) {

    override val bonificacao: Double
        get() {

            return  salario*0.1
        }

}

