package chapterone.school;

/**
 * A class that maintains details of a book
 * might form part of a larger system called library
 *
 */

public class Book {
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;


    public Book(String bookAuthor, String bookTitle, int bookPages){
        this.author = bookAuthor;
        this.title = bookTitle;
        this.pages = bookPages;
        this.refNumber = "";
        this.borrowed = 0;
    }

    public void borrow(){
        borrowed += 1;
    }


    public void setRefNumber(String refNumber) {
        if(refNumber.length() > 3) {
            this.refNumber = refNumber;
        }
        else {
            System.out.println("The refNumber length must be 3 characters or more.");
        }
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public int getBorrowed() {
        return borrowed;
    }

    public void printAuthor(){
        System.out.println(getAuthor());
    }

    public void printTitle(){
        System.out.println(getTitle());
    }

    public void printDetails(){
        if(refNumber.length() > 0){
            System.out.println("Title: " + getTitle() + "Author: " + getAuthor()
                    + "Pages: " + getPages() + "refNumber: " + getRefNumber() + "Borrowed: " + getBorrowed());
        }
        else {
            setRefNumber("ZZZ");
            System.out.println("Title: " + getTitle() + "Author: " + getAuthor()
                    + "Pages: " + getPages() + "refNumber: " + getRefNumber() + "Borrowed: " + getBorrowed()
            );
        }

    }
}
