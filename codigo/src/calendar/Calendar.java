package calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.time.LocalDate;  

public class Calendar {
    
    private List<Reminders> reminders = new LinkedList<>();

    Calendar() { }

    public void addDate(Reminders date) {
        reminders.add(date);
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
    }
}