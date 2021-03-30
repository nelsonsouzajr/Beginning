package one.digitalinnovation.collection

fun main() {
    val values = intArrayOf(5, 1, 2, 4, 8)

    values.forEach {
        println(it)
    }

    println("----------")

    values.sort()
    values.forEach {
        println(it)
    }
}