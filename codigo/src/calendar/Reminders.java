package calendar;

import java.time.LocalDate;

public class Reminders implements Comparable<Reminders> {
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

    public boolean getIsRepeating() {
        return isRepeating;
    }

    @Override 
    public int compareTo(Reminders r) {
        if(selectedDate.isAfter(r.selectedDate)) {
            return 1;
        }
        else if(selectedDate.equals(r.selectedDate)) {
            return 0;
        }
        else {
            return -1;
        }
    }
}
