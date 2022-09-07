package test;

import calendar.Reminders;
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;

public class RemindersTest {
    
    Reminders date1 = new Reminders("Dentista", LocalDate.parse("2022-09-07"));

    @Test
    public void shouldSetDaysToRepeat() {
        boolean expect[] = { false, true, false, true, false, false, true };
        date1.activeWeekDay(2);
        date1.activeWeekDay(4);
        date1.activeWeekDay(7);
        assertArrayEquals(expect, date1.getActiveDays());
    }

    @Test
    public void shouldChangeSelectedDateByRepeatRule() {
        date1.activeWeekDay(2);
        date1.activeWeekDay(4);
        date1.activeWeekDay(7);

        date1.setNextDay();
        assertEquals(LocalDate.parse("2022-09-08"), date1.getSelectedDate());
        date1.setNextDay();
        assertEquals(LocalDate.parse("2022-09-11"), date1.getSelectedDate());
        date1.setNextDay();
        assertEquals(LocalDate.parse("2022-09-13"), date1.getSelectedDate());
        date1.setNextDay();
        assertEquals(LocalDate.parse("2022-09-15"), date1.getSelectedDate());
    }

    @Test
    public void shouldActiveAndDeactiveRepeating() {
        date1.activeWeekDay(1);
        date1.activeWeekDay(2);
        date1.activeWeekDay(3);
        date1.activeWeekDay(4);
        date1.activeWeekDay(7);

        assertEquals(true, date1.getIsRepeating());

        date1.deactiveWeekDay(1);
        date1.deactiveWeekDay(2);
        date1.deactiveWeekDay(3);
        date1.deactiveWeekDay(4);

        assertEquals(true, date1.getIsRepeating());

        date1.deactiveWeekDay(7);

        assertEquals(false, date1.getIsRepeating());
    }
}
