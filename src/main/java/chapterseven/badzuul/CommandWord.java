package chapterseven.badzuul;

public enum CommandWord {

    GO("go"), BACK("back"), QUIT("quit"), HELP("help"), LOOK("look"), EAT("eat"), TAKE("take"), DROP("drop"), UNKNOWN("?");

    private String commandWord;

    CommandWord(String commandWord) {
        this.commandWord = commandWord;
    }

    public String getCommandWord() {
        return commandWord;
    }
}
