package chapterfour.club;

import java.util.ArrayList;
import java.util.Iterator;

public class Club {

    /**
     * List of type memeber
     */
    ArrayList<Membership> members;

    /**
     * constructor to initialize the fields
     */
    public Club(){
       members = new ArrayList<>();
    }

    /**
     * Add a member to the list of memebers
     * @param membership a member object to be added
     */
    public void join(Membership membership){
        members.add(membership);
    }

    public int noOfMemebers(){
        return members.size();
    }

    /**
     * Determine the number of members joined in a given month
     * @param month The month we are interested in
     * @return The number of members joined in given month
     */

    public int joinedInMonth(int month){

        int numberOfMembers = 0;
        if(month < 1 || month > 12){
            throw new IllegalArgumentException(
                    "Month " + month + " out of range. Must be in the range 1 ... 12");
        }
        else {
            for (Membership member: members) {
                if(member.getMonth() == month){
                    numberOfMembers++;
                }
            }
        }
        return numberOfMembers;
    }

    /**
     * Remove from the clubs collection all memebers
     * who joined in a given month and return them stored
     * in a separate collection object
     * @param month the month of the Memebership
     * @param year the year of the membership
     * @return the memebers who joined in the given month and year
     */

    public ArrayList<Membership> purge(int month, int year){
        Iterator<Membership> it = members.iterator();
        ArrayList<Membership> removedMembers = new ArrayList<>();
        if(month < 1 || month > 12){
            throw new IllegalArgumentException(
                    "Month " + month + " out of range. Must be in the range 1 ... 12");
        }

        while (it.hasNext()){
            Membership member = it.next();
            if((member.getMonth() == month) && (member.getYear() == year)){
                removedMembers.add(member);
            }
        }

        return removedMembers;
    }
}
