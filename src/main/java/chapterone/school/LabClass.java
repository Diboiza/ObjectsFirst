package chapterone.school;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class LabClass {

    private final Logger logger = LoggerFactory.getLogger("LabClassLogger");

    String unknown = "unknown";
    private String instructor;
    private String room;
    private String dayTime;
    private List<Student> students;
    private int capacity;

    public LabClass(int maxNumberOfStudents){
        instructor = unknown;
        room = unknown;
        dayTime = unknown;
        students = new ArrayList<>();
        capacity = maxNumberOfStudents;
    }

    public void enrollStudent(Student student){
        if(students.size() == capacity){
            logger.info("class is full, you cannot enrol");
        }
        else {
            students.add(student);
        }
    }

    public int numberOfStudents(){
        return students.size();
    }

    public void setRoom(String roomNumber){
        room = roomNumber;
    }

    public void setDayTime(String dayTimeString){
        dayTime = dayTimeString;
    }

    public void setInstructor(String newInstructor){
        instructor = newInstructor;
    }

    public void printList(){

        logger.info(MessageFormat.format("LabClass: {0}", dayTime));
        logger.info(String.format("Instructor: %s Room: %s", instructor, room));
        logger.info( "Class List:");

        for(Student student : students){
            student.printStudentDetails();
        }
        logger.info(String.format("Number of students: %s", numberOfStudents()));
    }
}
