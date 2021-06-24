package chapterfive.techsupportV1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class InputReader{

    //reader that will read user's input
    private Scanner reader;


    public InputReader(){
        this.reader = new Scanner(System.in);

    }

    /**
     * read a line of text from user's input
     * and return it as a set of words
     * @return a set of Strings, where each string is one of the words
     * typed by the user.
     */

    public HashSet<String> getInput() {
        System.out.println("> ");

        String clientQuery = reader.nextLine().trim().toLowerCase();

        String[] splitWords = clientQuery.split(" ");
        HashSet<String> words = new HashSet<>();

        for (String word: splitWords){
            words.add(word);
        }

        return words;
    }


}
