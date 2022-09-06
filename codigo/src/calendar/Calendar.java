package calendar;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.time.LocalDate; 

public class Calendar {
    
    private LinkedList<Reminders> reminders = new LinkedList<Reminders>();

    Calendar() { }

    public LinkedList<Reminders> getReminders() {
        return reminders;
    }

    public void addDate(Reminders date) {
        reminders.add(date);
        Collections.sort(reminders);
    }

    public void removeDate(Reminders r) {
        if(!r.getIsRepeating() && (LocalDate.now().equals(r.getSelectedDate()) || LocalDate.now().isAfter(r.getSelectedDate()))) {
            reminders.remove(r);
        } else if (r.getIsRepeating()){
            System.out.println("It can't be remove, cause its a repeating date");
        } else {
            System.out.println("It is not an old date");
        }
    }

    public void getAllDatesBetween(String first, String last) {
        LocalDate firstDate = LocalDate.parse(first);
        LocalDate lastDate = LocalDate.parse(last);

        for(Reminders element : reminders) {
            if((element.getSelectedDate().equals(firstDate) || element.getSelectedDate().isAfter(firstDate))&&
               (element.getSelectedDate().isBefore(lastDate) || element.getSelectedDate().equals(lastDate))) {
                System.out.print(element.getSelectedDate() + " ");
            }
        }
        System.out.println();
    }
}