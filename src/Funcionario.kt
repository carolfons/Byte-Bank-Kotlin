package org.kotlinlang.play

open class Funcionario(val nome: String,
                  val cpf: String,
                  val salario: Double

)
{
    // function to property
    open val bonificacao: Double
        get() {
            return salario * 0.1
        }

}