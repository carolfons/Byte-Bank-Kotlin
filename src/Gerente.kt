package org.kotlinlang.play

class Gerente(
        nome:String,
        cpf:String,
        salario:Double,
        senha: Int
):FuncionarioAdmin( //gerente herda da classe de funcionários
        nome = nome,
        cpf = cpf,
        salario = salario,
        senha = senha) {

    override val bonificacao: Double
        get() {

            return salario * 0.1 +salario
        }

}

