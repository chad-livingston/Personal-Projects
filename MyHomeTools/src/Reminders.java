import java.util.ArrayList;

public class Reminders {
    private String reminder;
    private String date;

    private ArrayList<Reminders> reminders = new ArrayList<>();

    public Reminders(String reminder, String date) {
        this.reminder = reminder;
        this.date = date;
    }
    public Reminders(){

    }
    public String getReminderName(){
        return reminder;
    }
    public String getReminderDate(){
        return date;
    }


    public void addReminder(Reminders reminder) {
        reminders.add(reminder);
    }
    public String toString(){
        String out = "";
        for (Reminders reminders : reminders){
            out = reminders.getReminderName() + ": " + reminders.getReminderDate();
        }
        return out;
    }
}
