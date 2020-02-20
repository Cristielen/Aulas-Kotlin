package com.example.aluno.nivelamento_kotlin

import org.junit.Test

class TestesKotlinPoo {

    @Test
    fun testeConta1(){

        val contaX = Conta()

        contaX.nomeTitular = "Cri"
        contaX.email = "bemSucedida@Sucesso.com"
        contaX.saldo = -1.0

        println(contaX.nomeTitular)
        println(contaX.email)
        println(contaX.saldo)
    }

    @Test
    fun testesJogador1() {
        val jogadorA = Jogador("Dido", 1.7, "Claro" )
         println(jogadorA.nome)

        jogadorA.nome = "Maria"
        println(jogadorA.nome)

        // não compila, pois altura é "val"
        // jogadorA.alura = 2.0
    }

    @Test
    fun testeAluni1() {
        val alunoA = Aluno("Cris", "ADS")

        val alunoB = Aluno ("Cris Tu fumas?")
    }
}