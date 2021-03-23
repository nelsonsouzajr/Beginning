package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String =  "Nelson"
    var cpf: String =   "999.999.999-99"

    inner class Endereco {
        var rua: String = "Rua Teste"
    }
}

fun main() {
    val nelson = Pessoa()

    println(nelson.nome)
    println(nelson.cpf)

    println(nelson.Endereco().rua)

}
