package chapterfour.notebook;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class to maintain a long list of notes
 * notes are numbered for external ref by a human user.
 */

public class Notebook{

    //storage of notes
    private ArrayList<String> notes;

    //initialize the notebook
    public Notebook(){
        notes = new ArrayList<>();
    }

    /**
     * Store a new note into the notebook.
     * @param note the note to be stored
     */

    public void addNote(String note){
        notes.add(note.toLowerCase());
    }

    /**
     * return the number of noted currently in the notebook
     */

    public int getNumberOfNotes(){
        return notes.size();
    }

    /**
     * a method to delete a note at a given index
     * @param index the index of the note to be deleted
     * @return the deleted note
     */

    public String deleteNote(int index){
        return notes.remove(index);
    }

    /**
     * show a note
     * @param noteNumber the number of the note to be shown
     */

    public void showNote(int noteNumber){
        if(noteNumber < 0){
            System.out.println("please enter a valid note number");
        }
        else if(noteNumber < notes.size()){
            System.out.println(notes.get(noteNumber));
        }
    }

    public String searchNote(String note){
        int index = 0;
        boolean found = false;
        String currentNote;
        int size = notes.size();
        while (index < size && !found){
            currentNote = notes.get(index);
            if(currentNote.contains(note.toLowerCase())){
                found = true;
            }
            else {
                index ++;
            }
        }
        if(found){
            return "The note was found";
        }
        else {
            return "No notes contain that search term";
        }
    }

    /**
     * Method to display all notes in the list
     */

    public void listAllNotes(){

        notes.trimToSize();
        for(String note : notes){
            System.out.println(notes.indexOf(note) + ": " + note);
        }
    }

    public void deleteNote(String note){
        Iterator<String> it = notes.iterator();
        while (it.hasNext()){
            String currentNote = it.next();
            if(currentNote.contains(note.toLowerCase())){
                it.remove();
            }
        }
    }


}
