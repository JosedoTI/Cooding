// ---------------------------------------------------------------
// Classe Veiculo
// ---------------------------------------------------------------
class Veiculo(
    val placa: String,
    val modelo: String,
    val cor: String
) {
    fun exibirInfo() {
        println("Veículo: $modelo ($cor) - Placa: $placa")
    }
}

// ---------------------------------------------------------------
// Classe Vaga
// urlFotoPilar é Nullable (String?) -> foto de referência opcional
// ---------------------------------------------------------------
class Vaga(
    val setor: String,
    val numero: Int,
    val nivel: Int,
    val urlFotoPilar: String? = null
) {
    // Regra 2: setor do estacionamento com when
    fun descricaoSetor(): String {
        return when (setor.uppercase()) {
            "A" -> "Setor Azul (Próximo à Entrada)"
            "B" -> "Setor Verde (Coberto)"
            "C" -> "Setor Amarelo (Descoberto)"
            else -> "Setor desconhecido"
        }
    }

    // Regra 5: Null Safety com operador Elvis (?:)
    fun fotoReferencia(): String {
        return urlFotoPilar ?: "Nenhuma foto de referência salva para esta vaga"
    }

    fun exibirInfo() {
        println("Localização: ${descricaoSetor()} | Vaga $numero | Nível $nivel")
        println("Foto: ${fotoReferencia()}")
    }
}

// ---------------------------------------------------------------
// Classe TicketEstacionamento
// ---------------------------------------------------------------
class TicketEstacionamento(
    val tempoMaximoMinutos: Int,
    val tempoDecorrido: Int,
    val valorHora: Double = 5.0
) {
    // Diferença entre o tempo máximo permitido e o tempo decorrido
    fun tempoRestante(): Int = tempoMaximoMinutos - tempoDecorrido

    fun estaVencendo(): Boolean = tempoRestante() <= 15

    fun estaVencido(): Boolean = tempoRestante() < 0

    fun valorAPagar(): Double = (tempoDecorrido / 60.0) * valorHora

    // Regra 3: alerta de vencimento com if/else
    fun verificarVencimento() {
        val restante = tempoRestante()
        if (estaVencendo()) {
            println("ALERTA: Seu tíquete está vencendo! Volte ao veículo.")
        } else {
            println("Tíquete em dia. Tempo restante: $restante minutos.")
        }
        if (estaVencido()) {
            println("Atenção: o tíquete já expirou há ${-restante} minutos.")
        }
    }
}

// ---------------------------------------------------------------
// Histórico das últimas 3 vagas (Regra 4)
// ---------------------------------------------------------------
class HistoricoVagas(private val limite: Int = 3) {
    private val vagas = mutableListOf<Vaga>()

    fun registrar(vaga: Vaga) {
        vagas.add(0, vaga) // mais recente primeiro
        if (vagas.size > limite) {
            vagas.removeAt(vagas.lastIndex)
        }
    }

    // Laço for para iterar no histórico
    fun exibir() {
        println("--- Histórico recente ---")
        for ((indice, vaga) in vagas.withIndex()) {
            println("Última parada ${indice + 1}: Setor ${vaga.setor}, Vaga ${vaga.numero}")
        }
    }
}

// ---------------------------------------------------------------
// Programa principal
// ---------------------------------------------------------------
fun main() {
    val veiculo = Veiculo("ABC-1234", "Honda Civic", "Preto")
    val historico = HistoricoVagas()

    // Paradas anteriores (algumas sem foto, outras com)
    historico.registrar(Vaga("B", 12, 1))
    historico.registrar(Vaga("C", 45, 2, "https://exemplo.com/pilar45.jpg"))
    historico.registrar(Vaga("A", 7, 1))
    historico.registrar(Vaga("A", 21, 3)) // a mais antiga (B-12) sai da lista

    // Vaga atual
    val vagaAtual = Vaga("A", 21, 3) // sem foto -> urlFotoPilar = null
    val ticket = TicketEstacionamento(tempoMaximoMinutos = 120, tempoDecorrido = 108)

    println("===== Estacionamento Uninorte ! =====")
    veiculo.exibirInfo()
    println()
    vagaAtual.exibirInfo()
    println()
    println("Tempo máximo: ${ticket.tempoMaximoMinutos} min | Decorrido: ${ticket.tempoDecorrido} min")
    println("Valor parcial: R$ %.2f".format(ticket.valorAPagar()))
    ticket.verificarVencimento()
    println()
    historico.exibir()
}
