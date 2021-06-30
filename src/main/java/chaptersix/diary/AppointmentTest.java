package chaptersix.diary;

public class AppointmentTest {
    public static void main(String[] args) {
        Appointment appointment_1 = new Appointment("first appointment", 1);
        Appointment appointment_2 = new Appointment("second appointment", 1);
        Appointment appointment_3 = new Appointment("third appointment", 1);
        Appointment appointment_4 = new Appointment("4th",1);
        Day day = new Day(1);

        day.showAppointments();

        day.makeAppointment(9,appointment_1);
        day.makeAppointment(10,appointment_2);
        day.makeAppointment(11,appointment_3);
        System.out.println(day.findSpace(appointment_4));

    }
}
