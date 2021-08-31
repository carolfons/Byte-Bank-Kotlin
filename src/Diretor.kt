package org.kotlinlang.play

class Diretor(
        nome:String,
        cpf:String,
        salario:Double,
        senha: Int,
        val plr:Int

):FuncionarioAdmin( //Diretor herda da classe de funcionários
        nome = nome,
        cpf = cpf,
        salario = salario,
        senha = senha)
{

    override val bonificacao: Double
        get() {

            return  +salario + plr
        }
}

