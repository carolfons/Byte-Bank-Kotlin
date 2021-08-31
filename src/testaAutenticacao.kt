package org.kotlinlang.play

fun testaAutenticacao() {
    val gerente = Gerente(nome = "alex",
            cpf = "111.111.111-11",
            salario = 1000.0,
            senha = 12345)

    val diretora = Diretor(
            nome = "fran",
            cpf = "222.222.222-22",
            salario = 2000.0,
            senha = 1303,
            plr = 200
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 12345)
    sistema.entra(diretora, 1303)

    
}