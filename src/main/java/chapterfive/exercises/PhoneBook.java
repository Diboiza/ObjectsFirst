package chapterfive.exercises;

import java.util.HashMap;

public class PhoneBook {
    HashMap<String, String> contacts;

    public PhoneBook(){
        contacts = new HashMap<>();
    }

    public void addContact(String name, String number){
        contacts.put(name,number);
    }

    public String lookupNumber(String name){
       return contacts.get(name);
    }
}
