package org.kotlinlang.play

class Gerente(
        nome:String,
        cpf:String,
        salario:Double,
        val senha: Int
):Funcionario( //gerente herda da classe de funcionários
        nome = nome,
        cpf = cpf,
        salario = salario) {

    fun autentica(senha:Int):Boolean{
        if(this.senha == senha){
            return true
        }
        return false

    }

    override val bonificacao: Double
        get() {
            return salario * 0.1 +salario
        }

}

