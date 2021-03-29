package one.digitalinnovation.collection

fun main() {
    val values = intArrayOf(3, 2, 4, 1, 10, 7)

    values.forEach {
        println(it)
    }

    println("----------")
    values.sort()
    values.forEach {
        println(it)
    }
}