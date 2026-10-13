fun main() {
    val veiculo = Veiculo("AAA-0000", "VW GOL", "Preto")
    val historico = HistoricoVagas()
    
    historico.registrar(Vaga("B", 12, 1))
    historico.registrar(Vaga("C", 45, 2, "https://exemplo.com/pilar45.jpg"))
    historico.registrar(Vaga("A", 7, 1))
    historico.registrar(Vaga("A", 21, 3))
        
    val vagaAtual = Vaga("A", 21, 3)
    val ticket = TicketEstacionamento(tempoMaximoMinutos = 120, tempoDecorrido = 108)

    println("Valor parcial: R$ %.2f".format(ticket.valorAPagar()))
