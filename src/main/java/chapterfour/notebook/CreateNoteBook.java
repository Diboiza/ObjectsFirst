package chapterfour.notebook;

public class CreateNoteBook {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();

        notebook.addNote("Cook");
        notebook.addNote("dishup");
        notebook.addNote("eat");
        notebook.addNote("clean dishes");
        notebook.deleteNote("coo");
        notebook.listAllNotes();
    }
}
