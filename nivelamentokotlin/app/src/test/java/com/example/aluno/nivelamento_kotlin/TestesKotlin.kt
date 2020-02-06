package com.example.aluno.nivelamento_kotlin

import org.junit.Test

class TestesKotlin {

    @Test
    fun testeTiposKotlin() {

        //tipagem dinâmica
        val bairro = "Saúde"
        val populacao = 15000
        val idh = 0.89

        // a Kotlin INFERE o tipo atravéz do valor

        //tipagem estática
        val cidade:String = "São Paulo"
        val fundacao:Int = 1554 // tipo Inteiro
        val temperatura:Double = 22.4
        val isCapital:Boolean = true

        //conversão de tipos
        val idade = "39" // supondo que foi recebido RT
        val idadeNum:Int = idade.toInt()
        val idadeReal:Double = idade.toDouble()
        val idadeBoolean: Boolean = idade.toBoolean()

        //idadeNum = idade.toIntOrNull()




    }

    @Test
    fun testeStringKotlin() {
        println("Hello Girls")

        //interpolação
        val pais = "Canadá"
        val continente = "America do Norte"
        println("O país ${pais} fica no continente ${continente}")
        println("Minha média foi ${10 + 9 + 7 /3}")


        //Multi-line String
        val instrucao = """
            select * from tabela where campo = 0 order by id desc """.trimIndent()
        println(instrucao)
    }


    //Uma vez dado o valor para uma variavel  ela não pode ser mudado com o val
    @Test
    fun testeMutaveisImutaveisKotlin() {

        // com val o objeto é imutavel
        val endereco = "xyz"
//        endereco = "abc"

        // com var o objeto é mutavel
        var contador = 0
        contador = 1
    }

    // Argumentos em funções são IMUTÁVEIS
    fun calcularInss(salario:Double){
        val inss = salario * 0.1
        println("INSS de ${salario} será ${inss}.")
    }
}