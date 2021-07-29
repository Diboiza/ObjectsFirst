package chapterone.school;

public class CreateStudents {

    public static void main(String[] args) {
        Student steven = new Student("Ste", 12345,"New student", 45, "ST123");
        Student maria = new Student("Maria", 12345,"New student", 45,"ST123");
        Student jabulani = new Student("jabulani", 12345,"New student", 45, "ST123");
        Instructor profMaphiri = new Instructor("Maphiri", 5268, "Software Engineering", "SE001");

        LabClass labClass = new LabClass(4);

        steven.addCredits(150);
        maria.addCredits(129);
        jabulani.addCredits(119);
        System.out.println(steven.getLoginName());

        steven.printDetails();
        maria.printDetails();
        jabulani.printDetails();

        labClass.enrollStudent(steven);
        labClass.enrollStudent(maria);
        labClass.enrollStudent(jabulani);
        labClass.setInstructor(profMaphiri);
        labClass.setDayTime("Monday 12pm");
        labClass.setRoom("IT Room");
        labClass.printList();
    }

}
