package chaptersix.diary;

public class Appointment {

    //The description of the appointment
    private String description;

    //the duration of the appointment
    private int duration;

    /**
     * Create and appointment with a given duration and description
     * @param description of the appointment
     * @param duration of the appointment
     */

    public Appointment(String description, int duration){
        this.description = description;
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }


}
