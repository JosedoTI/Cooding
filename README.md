Estudo de Caso 21: Localizador de Estacionamento (Onde Parei?)
Contextualização
Vocês desenvolverão a lógica base de um aplicativo utilitário para motoristas. O sistema precisa registrar coordenadas ou blocos de estacionamento, calcular o tempo decorrido e alertar sobre o vencimento de tíquetes de Zona Azul.
Requisitos Obrigatórios
POO: Classes Veiculo, Vaga e TicketEstacionamento.
Variáveis e Tipos: String, Double, Int, Boolean.
Condicionais: if/else para alertas de vencimento e when para setores do estacionamento.
Laços: for para iterar no histórico de vagas recentes.
Null Safety: Fotos de referência opcionais da vaga.
Regras de Negócio
Modelagem: Vaga (setor, numero, nivel), Ticket (tempoMaximoMinutos, tempoDecorrido).
Setor do Estacionamento (when): O usuário informa a cor ou código do setor: "A" -> "Setor Azul (Próximo à Entrada)", "B" -> "Setor Verde (Coberto)", "C" -> "Setor Amarelo (Descoberto)".
Tempo e Vencimento (if/else): Calcule a diferença entre o tempo máximo permitido e o tempo decorrido. Se a diferença for menor ou igual a 15 minutos, exiba: "ALERTA: Seu tíquete está vencendo! Volte ao veículo.".
Histórico Recente (Laço): O sistema mantém uma lista das últimas 3 vagas onde o usuário parou. Use um laço for para imprimir: "Última parada [índice]: Setor X, Vaga Y".
Foto de Referência (Null Safety): A propriedade 'urlFotoPilar' é Nullable (String?). Se for nula, o app deve exibir o aviso "Nenhuma foto de referência salva para esta vaga" através do operador Elvis (?:).
