package chapterone.school;

/**
 * the Instructor class models the instructor of the school
 * @author: Bongani Maphiri
 */
public class Instructor extends Person{

    private String employeeNo;

    /**
     * Initialize the fields of the instructor
     * @param name
     * @param contact
     * @param details
     * @param employeeNo
     */
    public Instructor(String name, int contact, String details, String employeeNo) {
        super(name, contact, details);
        this.employeeNo = employeeNo;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }
}
