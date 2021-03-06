package chapterseven.badzuul;

import java.util.HashMap;

/**
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 * 
 * This class holds an enumeration of all command words known to the game.
 * It is used to recognise commands as they are typed in.
 *
 * @author  Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */

public class CommandWords
{

    // a constant hashmap that holds all valid command words
    private HashMap<String, CommandWord> validCommands;


    /**
     * Constructor - initialise the command words.
     */
    public CommandWords()
    {
        validCommands = new HashMap<>();
        for (CommandWord command: CommandWord.values()) {
            if(command != CommandWord.UNKNOWN){
                validCommands.put(command.toString(), command);
            }
        }
    }

    /**
     * Check whether a given String is a valid command word. 
     * @return true if a given string is a valid command,
     * false if it isn't.
     */
    public CommandWord getCommandWord(String commandWord)
    {
        CommandWord command = validCommands.get(commandWord);
        if(command != null){
            return command;
        }
        else {
            return CommandWord.UNKNOWN;
        }
    }

    public boolean isCommand(String aString){
        return validCommands.containsKey(aString);
    }

    public String showAll(){
        StringBuilder bld = new StringBuilder();

        for (String command: validCommands.keySet()) {
            bld.append(command + " ");
        }
        return bld.toString();
    }
}
