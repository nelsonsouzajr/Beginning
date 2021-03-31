package one.digitalinnovation.collection

fun main() {
    val a = "--------------------"
    val salarios = arrayOf(
            "2000".toBigDecimal(),
            "1500".toBigDecimal(),
            "4000".toBigDecimal()
    )
    println(a)
    println(salarios.somatoria())

    println(a)
    println(salarios.media())
}