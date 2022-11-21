[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-c66648af7eb3fe8bc4f294546bfd86ef473780cde1dea487d3c4ff354943c9ae.svg)](https://classroom.github.com/online_ide?assignment_repo_id=8350659&assignment_repo_type=AssignmentRepo)
# Calendar
Esse projeto é a contrução de uma agenda que têm como objetivo principal:
 - Permitir a criação de compromissos em datas específicas.
 - Cadastrar compromissos periódicos
 - Fornecer um relatório de compromissos entre uma data inicial e uma data final(incluindo ambas)

# Correção

# Diagrama de classes: 0/2 pontos 
	- não entregou
	
# Requisitos corretamente implementados: 6/9 pontos 
	- print em código de classe: acoplamento incorreto
	- cuidado com construtor vazio (Calendar)
	- ordenar a cada inserção (addDate) não é boa ideia (desempenho)
	- se você dá um parse em getAllDatesBetween, por que não no construtor de Reminder? Pior: é um parse em um LocalDate sem nenhuma documentação de como ele funcionará. 
	- não vi maneira clara de falar sobre repetições e períodos de compromissos.
	
	
# Documentação de código: 0/4 pontos 
	
# Testes: 3/5 pontos
	- o teste é um código Java. Se for realizar atividades repetidas, use uma instrução de repetição (for, while...)
	- não vi teste do relatório de datas, nem da repetição
	- no teste de Reminder, um teste está testando duas coisas (ativar e desativar dia da semana). Cada teste deve testar UM aspecto (por isso, teste unitário).
	- além disso, 'ativar em dia da semana' não era um requisito necessário.
	
# Comentário geral
Vê-se que você é um bom programador. Modularidade, no entanto não é só isso: é a aplicação de diversas práticas para o código ser, de fato, modularizado. E, veja, o desenvolvimento incremental ocorre em etapas justamente para evitar que o projeto se distancie dos requisitos do usuário. Ao faltar seguidamente, ou comparecer mas não mostrar nada efetivo para 'o cliente', corre-se o risco do que aconteceu: temos um código razoavelmente bem programado, mas que não atende ao que foi pedido.

## Alunos integrantes da equipe

* Yghor Ribas Gomes

## Professores responsáveis

* João Caram
