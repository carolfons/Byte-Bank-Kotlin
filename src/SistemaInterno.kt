package org.kotlinlang.play

class SistemaInterno {

    fun entra(admin: FuncionarioAdmin, senha: Int){
        if(admin.autentica(senha)){
            println("Bem Vindo ao ByteBank")
        }else{
            println("Falha na autenticação!")
        }

    }

}