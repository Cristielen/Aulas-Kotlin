package com.example.aluno.nivelamento_kotlin

class Conta {


    var nomeTitular:String? = null
    set(value) {
        if(value!=null && value?.length > 2){
            field = value
        }
    }

    var saldo:Double = 0.0
    set(value) {
        if(value >= 0.0){
            field = value
            contadorTransacoes++
        }

    }

    //o field representa o email no caso a variavel
    var email:String? = null
    get() = field?.toLowerCase()


    private var contadorTransacoes:Int = 0
    //não gera ge/set automatico
    //Nesse caso o "get" e "set" devem ser métodos "manuais"
}