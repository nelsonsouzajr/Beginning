package one.digitalinnovation.collection

fun main() {
    val values = IntArray(5)
    values[0]=5
    values[1]=2
    values[2]=4
    values[3]=7
    values[4]=1

    for(valor in values) {
        println(valor)
    }

    println("----------") // proximo comando it toma o nome da variavel, que pode ser alterado por exemplo "valor ->
    values.forEach {
        println(it)
    }

    println("----------")//index é a nossa variavel

    for (index in values.indices){
        println(values[index])
    }
    println("----------")//.sort ordena os valores por padrao em sequencia do menor para o maior
    values.sort()
    for(valor in values){
        println(valor)
    }
    println("----------")//valores que serão impressos 0,1,4,9,16
    val asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { println(it) }
}