package chapterone.school;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * class Student which models the students in a class
 * @author: Bongani Maphiri
 */
public class Student extends  Person {

    private final Logger logger = LoggerFactory.getLogger("StudentLogger");

    private int credits;
    private String id;

    /**
     * Initialize the fields of a student
     * @param name of a student
     * @param contact of a student
     * @param details of a student
     * @param credits of a student
     * @param id of a student
     */
    public Student(String name, int contact, String details, int credits, String id) {
        super(name, contact, details);
        if(name.length() < 4 && id.length() < 3){
            logger.warn("The length of the Name or ID is too short");
        }
        this.id = id;
        credits = 0;
    }

    /**
     *
     * @return the student ID
     */
    public String getStudentID(){
        return id;
    }

    /**
     *
     * @param additionalCredits to be rewarded to a student
     */
    public void addCredits(int additionalCredits){
        credits += additionalCredits;
    }

    /**
     *
     * @return students total number of credits
     */
    public int getCredits(){
        return credits;
    }

    /**
     *
     * @return student login details
     */
    public String getLoginName(){
        return getName() + id;
    }

}
