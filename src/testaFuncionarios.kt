package org.kotlinlang.play

 fun testaFuncionarios() {
    val alex = Analista(nome = "Alex",
            cpf = "111.111.111-12",
            salario = 1000.0)

    println("Analista")
    println("nome: ${alex.nome}")
    println("cpf: ${alex.cpf}")
    println("salário: ${alex.salario}")
    println("bonificação: ${alex.bonificacao} ")

    val fran = Gerente(nome = "Fran",
            cpf = "123.123.123-12",
            salario = 2000.0,
            senha = 1234
    )

    println("-------------------")
    println("Gerente")
    println("nome: ${fran.nome}")
    println("cpf: ${fran.cpf}")

    println("salário: ${fran.salario}")
    println("bonificação: ${fran.bonificacao} ")

    println("Autenticação:")

    if (fran.autentica(1234)) {
        println("Autenticado com sucesso")
    } else {
        println("Não autenticado!")
    }

    val gui = Diretor(
            nome = "Gui",
            cpf = "333.333.333-33",
            salario = 3000.0,
            senha = 1303,
            plr = 200
    )

    println("-------------------")
    println("Diretor")
    println("nome: ${gui.nome}")
    println("cpf: ${gui.cpf}")

    println("salário: ${gui.salario}")
    println("plr: ${gui.plr}")
    println("bonificação: ${gui.bonificacao} ")

    println("Autenticação:")

    if (gui.autentica(1303)) {
        println("Autenticado com sucesso")
    } else {
        println("Não autenticado!")
    }

    val maria = Analista(
            nome = "Maria",
            cpf = "444.444.444-44",
            salario = 3000.0)

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)



    println("Total de bonificação: ${calculadora.total}")
}