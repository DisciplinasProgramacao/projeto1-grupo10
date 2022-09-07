# Especifique aqui seu plano de testes, no formato:

Classe CalendarTest:
1. Verificar inserções de itens na lista e sua ordenação
  - shouldInsertADateAndSortReminders
2. Verificar remoções de itens validos na lista
  - shouldRemoveValidDate

Classe RemindersTest:
1. Verificar se os dias da semana em que o lembrete deve ativar
  - shouldSetDaysToRepeat
2. Verificar se os dias estão mudando de acordo com os dias ativos do lembrete
  - shouldChangeSelectedDateByRepeatRule
3. Verificar ativação e desativação dos dias da semana em que o lembrete repetirá
  - shouldActiveAndDeactiveRepeating
