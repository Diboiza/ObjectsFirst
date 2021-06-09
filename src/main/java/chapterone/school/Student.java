package chapterone.school;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Student {

    private final Logger logger = LoggerFactory.getLogger("StudentLogger");
    private String name;
    private String id;
    private int credits;

    public Student(String name, String id){

        if(name.length() < 4 && id.length() < 3){
            logger.warn("The length of the Name or ID is too short");
        }
        this.name = name;
        this.id = id;
        credits = 0;
    }

    public String getName(){
        return name;
    }

    public void changeName(String newName){
        name = newName;
    }

    public String getStudentID(){
        return id;
    }

    public void addCredits(int additionalCredits){
        credits += additionalCredits;
    }

    public int getCredits(){
        return credits;
    }

    public String getLoginName(){
        return name + id;
    }

    public void printStudentDetails(){
        String studentDetails = String.format("%s Student ID: %s Credits: %s" ,name,id,credits);
        logger.info(studentDetails);
    }
}
