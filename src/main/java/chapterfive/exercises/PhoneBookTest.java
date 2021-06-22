package chapterfive.exercises;

public class PhoneBookTest {

    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();

        book.addContact("bongz", "123456");
        book.addContact("bongz", "345678");

        System.out.println(book.lookupNumber("bongza"));
    }
}
