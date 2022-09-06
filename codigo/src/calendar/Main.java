package calendar;

import java.util.Arrays;
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
        Reminders date4 = new Reminders("Dermatologista", LocalDate.parse("2022-09-04"));
        
        insert(agenda, date1);
        insert(agenda, date2);
        insert(agenda, date3);
        insert(agenda, date4);

        date3.activeWeekDay(1);
        date3.activeWeekDay(6);

        System.out.println(Arrays.toString(date3.getActiveDays()));

        date3.setNextDay();
        System.out.println(date3.getSelectedDate());
        date3.setNextDay();
        System.out.println(date3.getSelectedDate());
        date3.setNextDay();
        System.out.println(date3.getSelectedDate());
        date3.setNextDay();
        System.out.println(date3.getSelectedDate());

        // agenda.removeDate(date3);
        // agenda.removeDate(date4);

        agenda.getAllDatesBetween("2022-09-03", "2022-09-20");
    }

    public static void insert(Calendar agenda, Reminders date) {
        agenda.addDate(date);
    }
}