package chapterfive.starwars;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class NameGenerator {

    private Scanner scanner;
    private String firstName;
    private String lastName;
    private String maidenName;
    private String town;
    Random random = new Random();

    //contructor with defaultNames
    public NameGenerator(){
        this.scanner = new Scanner(System.in);

    }

    public void generateStarWarsName(){

        printWelcome();

        System.out.println("Please provide your first name: ");
        firstName = scanner.nextLine().trim().toLowerCase().substring(0,3);

        System.out.println("Please provide your last name: ");
        lastName = scanner.nextLine().trim().toLowerCase().substring(0,2);

        System.out.println("Please provide your mother's maiden name: ");
        maidenName = scanner.nextLine().trim().toLowerCase().substring(0,2);

        System.out.println("Please provide the town you were bornn in");
        town = scanner.nextLine().trim().toLowerCase().substring(0, 3);

        String starWarsFirstName = firstName.concat(lastName);
        String starWarsLastName = maidenName.concat(town);

        System.out.println("Yours star wars name is: " + starWarsFirstName + " " + starWarsLastName);
    }

    public void printWelcome(){
        System.out.println("""
                **********************************************************
                **------Welcome to the Starwars Name Generator App------**
                **********************************************************
                """);
        System.out.println("To start of we will need some info from you.");
    }
}
