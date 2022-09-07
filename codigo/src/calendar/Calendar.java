package calendar;

import java.util.Collections;
import java.util.LinkedList;
import java.time.LocalDate; 

public class Calendar {
    
    private LinkedList<Reminders> reminders = new LinkedList<Reminders>();

    public Calendar() { }

    public LinkedList<Reminders> getReminders() {
        return reminders;
    }

    public void addDate(Reminders date) {
        reminders.add(date);
        Collections.sort(reminders);
    }

    public void removeDate(Reminders r) {
        if(!r.getIsRepeating()) {
            reminders.remove(r);
        } else {
            System.out.println("It can't be remove, cause its a repeating date");
        }
    }

    public void getAllDatesBetween(String first, String last) {
        Collections.sort(reminders);
        LocalDate firstDate = LocalDate.parse(first);
        LocalDate lastDate = LocalDate.parse(last);

        System.out.println("\n\nYour events");
        for(Reminders element : reminders) {
            if((element.getSelectedDate().equals(firstDate) || element.getSelectedDate().isAfter(firstDate))&&
               (element.getSelectedDate().isBefore(lastDate) || element.getSelectedDate().equals(lastDate))) {
                System.out.println("Event:" + element.getName() + " " + element.getSelectedDate() + " ");
            }
        }
        System.out.println();
    }

    public void printTodayReminders() {
        System.out.println("\n\nWhat's for today?");
        for(Reminders element : reminders) {
            if(LocalDate.now().equals(element.getSelectedDate())) {
                System.out.println("Event:" + element.getName() + " " + element.getSelectedDate() + " ");
            }
        }
    }
}