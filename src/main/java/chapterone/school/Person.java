package chapterone.school;

/**
 * The person class will be the base class of all common persons
 * in the school.
 * @author: Bongani Maohiri
 */
public class Person {

    private String name;
    private int contact;
    private String details;

    /**
     * Initialize the fields of the person
     * @param name of the person
     * @param contact of the person
     * @param details of the person
     */

    public Person(String name, int contact, String details) {
        this.name = name;
        this.contact = contact;
        this.details = details;
    }

    /**
     *
     * @return the name of the person
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name of the person
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return contact details of the person
     */
    public int getContact() {
        return contact;
    }

    /**
     * set the contact details
     * @param contact int phone numbers
     */
    public void setContact(int contact) {
        this.contact = contact;
    }

    /**
     * get the tails of a person
     * @return details of the person
     */
    public String getDetails() {
        return details;
    }

    /**
     * set the details of the person
     * @param details
     */
    public void setDetails(String details) {
        this.details = details;
    }

    public String printStudentDetails(){
       return String.format("%s Student ID: %s Credits: %s" ,getName(),getContact(),getDetails());
    }
}
