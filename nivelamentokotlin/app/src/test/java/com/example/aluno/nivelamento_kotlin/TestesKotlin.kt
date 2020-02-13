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
        val cidade: String = "São Paulo"
        val fundacao: Int = 1554 // tipo Inteiro
        val temperatura: Double = 22.4
        val isCapital: Boolean = true

        //conversão de tipos
        val idade = "39" // supondo que foi recebido RT
        val idadeNum: Int = idade.toInt()
        val idadeReal: Double = idade.toDouble()
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
        println("Minha média foi ${10 + 9 + 7 / 3}")


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

    @Test
    fun testesFuncoes() {
        val salario = 5000.0
        val ir = calcularIr(salario)
        println("O desc. de IR será de ${ir}")
    }

    // Argumentos em funções são IMUTÁVEIS
    fun calcularInss(salario: Double) {
        val inss = salario * 0.1
        println("INSS de ${salario} será ${inss}.")
    }

    // retorno em fuções
    fun calcularIr(salario: Double): Double {
        val ir = salario * 0.2
        return ir
    }


    @Test
    fun testVetoresListas() {

        //criando um vetor (array)
        val vetorFrutas = arrayOf("pêra", "maçã", "uva", "morango")
        val vetorFrutas2: Array<String> = arrayOf("pêra", "maçã", "uva")

        // o vetor frutas aceitaria a sua criação qualquer tipo

        //criando uma lista (List)
        val listaBairros = mutableListOf("luz", "são matheus", "saúde", "sé")
        val listabairro2: List<String> = mutableListOf("saúde", "sé")

        //add elementos numa lista
        listaBairros.add("cidade tiradentes") //um só
        listaBairros.addAll(listabairro2) //outra lista de uma vez

        println(listaBairros)

        listaBairros.remove("saúde")
        listaBairros.removeAt(0)

        //alternando o valor em uma posição
        listaBairros.set(0, "Moema")

        //O listOf() cria uma lista "somente leitura"
        val listaPaises = listOf("Canadá", "Austrália", "Japão", "Italia")
        //listaPaises.add("França") não é possível não compila

        //iterando em ou lista
        vetorFrutas.forEach {
            println("Frutas:  ${it}")
        }

        //iterando com nome d variável explícito
        vetorFrutas.forEach { fruta ->
            println("Frutas:  ${fruta}")
        }

        //iterado com nome de variável de indice e valor explícitos
        listaBairros.forEachIndexed { i, bairro ->
            println("Bairro ${i}: ${bairro}")
        }

        // filtrar o vetor ou a lista
        val filtrada = vetorFrutas.filter { it.toLowerCase().contains("m") }
        println(filtrada)


        //ordenação usando um atributo como critério
        println(listaBairros)
        listaBairros.sortBy { it.length }
        println("bairros em ordem de tamanho: ${listaBairros}")


        // ordenção inversa usando um atributo como critério
        listaBairros.sortByDescending { it.length }

        //métodos úteis
        println("Primeira fruta: ${vetorFrutas.first()}")
        println("Última fruta: ${vetorFrutas.last()}")

    }

    @Test
    fun tratamentoDeNulos() {
//        val cidade: String = null  // não compila, não aceita null

        var cidade: String = "Belém"
        //cidade =  null // não compila, não aceita null

        // para que um objeto possa aceitar null usamos ? após o tipo
        var telefoneComercial: String? = null
        var ultimaViagem: String? = "qual?"
        ultimaViagem = null
        // o var permite reatribuir, e o ? assume o risco de deixar nulo


        // supondo que "paisDosSonhos" foi preenchido em RT (TEMPO DE EXECUÇÃO)
        var paisDosSonhos: String? =  "Canadá"
        // existe a possibilidade de "paisDosSonhos" ser null

        // agora queremos invocar um método de "paisDosSonhos"
        //mas ele pode estar nulo, certo?

        val maiusculo = paisDosSonhos?.toUpperCase()
        // essa interrogação no Kotlin se chama SafeNavigation
        // Se o "paisDosSonhos" estiver nulo ele não vai dar NullPointerException por causa do
        // "?" (SafeNavigstion)
        // nesse caso, usamos o Safe Navigation (?) após o objeto
        println("maiusculo: ${maiusculo}")


        // Se quiser,é possivél tomar a NullPointerException
        // nesse caso, usamos o operador de execeção (!!)
        //paisDosSonhos!!.toUpperCase()

    }
}