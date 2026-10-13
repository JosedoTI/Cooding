class Vaga(
    val setor: String,
    val numero: Int,
    val nivel: Int,
    val urlFotoPilar: String? = null
) {

fun descricaoSetor(): String {
     return when (setor.uppercase()) {
            "A" -> "Setor Azul (Próximo à Entrada)"
            "B" -> "Setor Verde (Coberto)"
            "C" -> "Setor Amarelo (Descoberto)"
            else -> "Setor desconhecido"
        }
    }
    fun fotoReferencia(): String {
        return urlFotoPilar ?: "Nenhuma foto de referência salva para esta vaga"
    }
        fun exibirInfo() {
        println("Localização: ${descricaoSetor()} | Vaga $numero | Nível $nivel")
        println("Foto: ${fotoReferencia()}")
    }
