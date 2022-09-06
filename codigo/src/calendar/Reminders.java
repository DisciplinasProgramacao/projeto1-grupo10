package calendar;

import java.time.LocalDate;

public class Reminders {
    private String name;
    private LocalDate selectedDate;
    private boolean isRepeating = false;

    Reminders(String name, LocalDate selectedDate) {
        this.name = name;
        this.selectedDate = selectedDate;
    }

    public LocalDate getSelectedDate() {
        return selectedDate;
    }
}
