package chaptereight.DoME;

import java.util.ArrayList;

/**
 * The database class provides a facility to store CD and DVD info
 * It does not have the search functionality
 */
public class Database {

    private ArrayList<DVD> dvds;
    private ArrayList<CD> cds;

    /**
     * Initialize an empty database
     */
    public Database(){
        dvds = new ArrayList<>();
        cds = new ArrayList<>();
    }

    /**
     * Add a dvd to the database
     * @param dvd to be added to the database
     */
    public void addDvds(DVD dvd) {
        dvds.add(dvd);
    }

    /**
     * Add a cd to the database
     * @param cd to be added to the database
     */
    public void addCds(CD cd) {
        cds.add(cd);
    }


    public void list(){
        for (CD cd: cds) {
            cd.print();
            System.out.println();
        }

        for (DVD dvd: dvds) {
            dvd.print();
            System.out.println();
        }
    }
}
