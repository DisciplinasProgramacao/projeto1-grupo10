package calendar;

import java.util.Collections;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

class Main {

    public static void main(String[] args) throws Exception {
        Calendar agenda = new Calendar();
        Reminders date1 = new Reminders("Dentista", LocalDate.parse("2022-09-07"));
        Reminders date2 = new Reminders("Entrevista LocaLex Digital", LocalDate.parse("2022-09-16"));
        Reminders date3 = new Reminders("Academia", LocalDate.parse("2022-09-06"));
        
        insert(agenda, date1);
        insert(agenda, date2);
        insert(agenda, date3);

        agenda.getAllDatesBetween("2022-09-03", "2022-09-15");
    }

    public static void insert(Calendar agenda, Reminders date) {
        agenda.addDate(date);
    }
}