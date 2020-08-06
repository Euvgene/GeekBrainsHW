package LessonThreeLevel2.task2;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Phonebook {
    HashMap<String, HashSet<Integer>> phoneBook;

    public Phonebook() {
        this.phoneBook = new HashMap<>();
    }

    public void addPerson(int phoneNumber, String surname) {
        Iterator<HashSet<Integer>> iterator = phoneBook.values().iterator();
        while (iterator.hasNext() && !phoneBook.containsKey(surname)) {
            if (iterator.next().contains(phoneNumber)) {
                System.out.println("Can't add person " + surname + " with  phone number " + phoneNumber + ".");
                System.out.println("Such phone number " + phoneNumber + " already exist.");
                return;
            }
        }
        if (phoneBook.containsKey(surname)) {
            HashSet<Integer> phoneBook1 = phoneBook.get(surname);
            phoneBook1.add(phoneNumber);
        } else {
            phoneBook.put(surname, new HashSet<>(Collections.singletonList(phoneNumber)));
        }
    }

    public void getInformation(String surname) {
        if (phoneBook.containsKey(surname)) {
            System.out.println("Phone number of " + surname + " " + phoneBook.get(surname));
        } else {
            System.out.println("Can't find person - " + surname);
        }
    }
}
