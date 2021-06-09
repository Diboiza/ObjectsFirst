package chapterone.school;

public class CreateStudents {

    public static void main(String[] args) {
        Student steven = new Student("Ste", "ST");
        Student maria = new Student("Maria", "ST130");
        Student jabulani = new Student("jabulani", "ST129");

        LabClass labClass = new LabClass(4);

        steven.addCredits(150);
        maria.addCredits(129);
        jabulani.addCredits(119);
        System.out.println(steven.getLoginName());

        steven.printStudentDetails();
        maria.printStudentDetails();
        jabulani.printStudentDetails();

        labClass.enrollStudent(steven);
        labClass.enrollStudent(maria);
        labClass.enrollStudent(jabulani);
        labClass.setInstructor("Mr Dube");
        labClass.setDayTime("Monday 12pm");
        labClass.setRoom("IT Room");
        labClass.printList();
    }

}
