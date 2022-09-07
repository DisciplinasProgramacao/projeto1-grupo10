package test;

import calendar.*;

import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;
import java.util.LinkedList;



public class CalendarTest {

    Calendar agenda = new Calendar();
    
    Reminders date1 = new Reminders("Dentista", LocalDate.parse("2022-09-07"));
    Reminders date2 = new Reminders("Entrevista LocaLex Digital", LocalDate.parse("2022-09-16"));
    Reminders date3 = new Reminders("Academia", LocalDate.parse("2022-09-06"));
    Reminders date4 = new Reminders("Dermatologista", LocalDate.parse("2022-09-04"));
    Reminders date5 = new Reminders("Fazer compras", LocalDate.parse("2022-09-06"));

    @Test
    public void shouldInsertADateAndSortReminders() throws Exception {
        agenda.addDate(date1);
        agenda.addDate(date2);
        agenda.addDate(date3);
        agenda.addDate(date4);

        assertEquals(date4, agenda.getReminders().get(0));
        assertEquals(date3, agenda.getReminders().get(1));
        assertEquals(date1, agenda.getReminders().get(2));
        assertEquals(date2, agenda.getReminders().get(3));
    }

    @Test
    public void shouldResetReminder() {

    }

}
