enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario (val nome: String, val idade: Int, val nivel: Nivel)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val Nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        if (!inscritos.contains(usuario)){
            inscritos.add(usuario)
            println("A matricula do usuario ${usuario.nome} em  $nome foi realizada\n")
        }
        else{
            println("Usuario ja matriculado")
        }
    }
}
	
fun main() {
    val conteudo1 = ConteudoEducacional("Logica de programacao", 120)
    val conteudo2 = ConteudoEducacional("Programando em Kotlin", 180)
    
    val formacao1 = Formacao("Raciocionio Logico", Nivel.BASICO, listOf(conteudo1))
    val formacao2 = Formacao("Desenvolvimento em Kotlin", Nivel.AVANCADO, listOf(conteudo2))
    
    val usuario1 = Usuario("Danilo",26, Nivel.BASICO)
    val usuario2 = Usuario("Cassia",28, Nivel.AVANCADO)

    formacao1.matricular(usuario1)
    formacao1.matricular(usuario2)
    formacao2.matricular(usuario1)
    
    // Teste de saída de dados
    println("Formação: ${formacao1.nome}, Nível: ${formacao1.Nivel}")
    println("Conteúdos: ${formacao1.conteudos}")
    println("Inscritos: ${formacao1.inscritos}")

    println("\nFormação: ${formacao2.nome}, Nível: ${formacao2.Nivel}")
    println("Conteúdos: ${formacao2.conteudos}")
    println("Inscritos: ${formacao2.inscritos}")

}