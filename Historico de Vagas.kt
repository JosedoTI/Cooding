    fun registrar(vaga: Vaga) {
        vagas.add(0, vaga)
        if (vagas.size > limite) {
            vagas.removeAt(vagas.lastIndex)
        }
    }
