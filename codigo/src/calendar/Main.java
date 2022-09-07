package calendar;

import java.util.Arrays;
import java.time.LocalDate;

class Main {

    public static void main(String[] args) throws Exception {
        Calendar agenda = new Calendar();
        Reminders date1 = new Reminders("Dentista", LocalDate.parse("2022-09-07"));
        Reminders date2 = new Reminders("Entrevista LocaLex Digital", LocalDate.parse("2022-09-16"));
        Reminders date3 = new Reminders("Academia", LocalDate.parse("2022-09-06"));
        Reminders date4 = new Reminders("Dermatologista", LocalDate.parse("2022-09-04"));
        Reminders date5 = new Reminders("Fazer compras", LocalDate.parse("2022-09-06"));

        agenda.addDate(date1);
        agenda.addDate(date2);
        agenda.addDate(date3);
        agenda.addDate(date4);
        agenda.addDate(date5);

        date3.activeWeekDay(1);
        date3.activeWeekDay(6);

        date3.setNextDay();
        date3.setNextDay();
        date3.setNextDay();
        date3.setNextDay();

        // agenda.removeDate(date3);
        // agenda.removeDate(date4);

        agenda.printTodayReminders();
    
        agenda.getAllDatesBetween("2022-09-03", "2022-09-20");
    }
}