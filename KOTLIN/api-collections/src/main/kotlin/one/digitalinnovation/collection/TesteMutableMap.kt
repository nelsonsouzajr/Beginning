package one.digitalinnovation.collection

fun main() {
    val joao = funcionario("Joao",2400.0, "CLT")
    val maria = funcionario("Maria",1600.0,"PJ")
    val jose = funcionario("José",5000.0,"CLT")

    val repositorio = Repositorio<funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(jose.nome, jose)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))

    println("---------------------------------")
    repositorio.findAll().forEach { println(it) }


    println("---------------------------------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }
}