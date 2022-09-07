package calendar;

import java.time.LocalDate;

public class Reminders implements Comparable<Reminders> {
    private String name;
    private LocalDate selectedDate;
    private boolean isRepeating = false;
    //Its represent week days starting on monday and finish on sunday
    private boolean activeDays[] = {false, false, false, false, false, false, false};

    public Reminders(String name, LocalDate selectedDate) {
        this.name = name;
        this.selectedDate = selectedDate;
    }

    public void activeWeekDay(int weekDay) {
        if(weekDay > 0 && weekDay < 8) {
            activeDays[weekDay - 1] = true;
            isRepeating = true;
        }
        else {
            System.out.println("Enter a valid day, it must be between 1(MONDAY) and 7(SUNDAY)");
        }
    }

    public void deactiveWeekDay(int weekDay) {
        int activeDaysCounter = 0;
        if(weekDay > 0 && weekDay < 8) {
            activeDays[weekDay - 1] = false;
        }
        else {
            System.out.println("Enter a valid day, it must be between 1(MONDAY) and 7(SUNDAY)");
        }
        for(int i = 0; i < activeDays.length; i++) {
            if(activeDays[i]) {
                activeDaysCounter++;
            }
        }
        if(activeDaysCounter == 0) {
            isRepeating = false;
        }
    }

    public void setNextDay() {
        if(isRepeating) {
            //Uncomment this "if" to verify the date before set the next selectedDate
            //if(LocalDate.now().equals(selectedDate)) {
                int index = this.selectedDate.getDayOfWeek().getValue();
                int counter = 1;
                while(index != -1) {
                    if(index == 7) {
                        index = 0;
                    }
                    else if(!activeDays[index]) {
                        index++;
                        counter++;
                    } 
                    else {
                        this.selectedDate = selectedDate.plusDays(counter);
                        index = -1;
                    }
                }
            //}
        }
    }

    public String getName() {
        return name;
    }
    
    public LocalDate getSelectedDate() {
        return selectedDate;
    }

    public boolean getIsRepeating() {
        return isRepeating;
    }

    public boolean[] getActiveDays() {
        return activeDays;
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
