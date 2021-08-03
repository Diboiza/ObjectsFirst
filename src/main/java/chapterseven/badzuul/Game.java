package chapterseven.badzuul;

import java.util.Stack;

/**
 * This class is the main class of the "World of Zuul" application.
 * "World of Zuul" is a very simple, text based adventure game.  Users
 * can walk around some scenery. That's all. It should really be extended
 * to make it more interesting!
 * <p>
 * To play this game, create an instance of this class and call the "play"
 * method.
 * <p>
 * This main class creates and initialises all the others: it creates all
 * rooms, creates the parser and starts the game.  It also evaluates and
 * executes the commands that the parser returns.
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */

public class Game {
    private Parser parser;
    private Player player;
    private Stack<Room> previousRoom;

    /**
     * Create the game and initialise its internal map.
     */
    public Game(String playerName) {
        player = new Player(playerName);
        createRooms();
        parser = new Parser();
    }

    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms() {
        Room outside, theatre, pub, lab, office, cellar, trapDoor;
        Item theatreEntrance = new Item("Theatre", "Unknown");
        Item trees = new Item("Multiple Trees", "unknown");
        Item beam = new Item("Beams you to any room", "5kg");
        // create the rooms
        outside = new Room("outside the main entrance of the university");
        theatre = new Room("in a lecture theatre");
        pub = new Room("in the campus pub");
        lab = new Room("in a computing lab");
        office = new Room("in the computing admin office");
        cellar = new Room("in the cellar");
        trapDoor = new Room("trap door with no exits");

        // initialise room exits

        outside.setExits("east", theatre);
        outside.setExits("south", lab);
        outside.setExits("west", pub);
        theatre.setExits("west", outside);
        pub.setExits("east", outside);
        lab.setExits("north", outside);
        lab.setExits("east", office);
        office.setExits("west", lab);
        office.setExits("down", cellar);
        cellar.setExits("up", office);
        cellar.setExits("down", trapDoor);
        trapDoor.setExits("up", trapDoor);

        //Add items to a room
        outside.addItem(theatreEntrance);
        outside.addItem(trees);
        trapDoor.addItem(beam);

        player.setCurrentRoom(outside);  // start game outside
        previousRoom = new Stack<>();
    }

    /**
     * Main play routine.  Loops until end of play.
     */
    public void play() {
        printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.

        boolean finished = false;
        while (!finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
    }

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome() {
        System.out.println();
        System.out.println("Welcome to the World of Zuul!");
        System.out.println("World of Zuul is a new, incredibly boring adventure game.");
        System.out.println("Type 'help' if you need help.");
        System.out.println();
        printLocationInfo();
    }

    /**
     * Given a command, process (that is: execute) the command.
     *
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command) {
        boolean wantToQuit = false;

        CommandWord commandWord = command.getCommandWord();
        switch (commandWord)
        {
            case UNKNOWN -> printHelp();
            case GO -> goRoom(command);
            case BACK -> back();
            case LOOK -> look();
            case EAT -> eat();
            case QUIT -> wantToQuit = quit(command);
        }
        return wantToQuit;
    }


    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the
     * command words.
     */
    private void printHelp() {
        System.out.println("You are lost. You are alone. You wander");
        System.out.println("around at the university.");
        System.out.println();
        System.out.println("Your command words are:");
        parser.showCommands();
    }

    /**
     * Try to go to one direction. If there is an exit, enter
     * the new room, otherwise print an error message.
     */
    private void goRoom(Command command) {
        if (!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        } else if (!player.getCurrentRoom().getExitString().contains(command.getSecondWord())) {
            System.out.println("This room does not have that direction");
        } else {
            String direction = command.getSecondWord();

            // Try to leave current room.
            Room nextRoom = player.getCurrentRoom().getExit(direction);
            previousRoom.push(player.getCurrentRoom());
            player.setCurrentRoom(nextRoom);
            printLocationInfo();
        }
    }

    /**
     * print the current location that player is at.
     */
    public void printLocationInfo() {
        System.out.println(player.getCurrentRoom().getLongDescription());
    }

    /**
     * print everything that is in the current room
     */
    private void look() {
        System.out.println(player.getCurrentRoom().getLongDescription());
    }

    /**
     * pickup an item in the room
     */
    private void take(Item item){
        player.take(item);
    }

    /**
     * eat some food and print a message afterwards that you have eaten
     */
    private void eat() {
        System.out.println("you have eaten, you are full now");
    }

    /**
     * go to the previous room that you were in.
     */
    private void back() {
        if(previousRoom.empty()){
            System.out.println("no room to go back to");
        }
        else {
            Room nextRoom = previousRoom.pop();
            player.setCurrentRoom(nextRoom);
            printLocationInfo();
        }
    }


    /**
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game.
     *
     * @return true, if this command quits the game, false otherwise.
     */
    private boolean quit(Command command) {
        if (command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        } else {
            return true;  // signal that we want to quit
        }
    }
}
