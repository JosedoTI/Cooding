class Veiculo(
    val placa: String,
    val modelo: String,
    val cor: String
) {

      fun exibirInfo() {
        println("Veículo: $modelo ($cor) - Placa: $placa")
    }
