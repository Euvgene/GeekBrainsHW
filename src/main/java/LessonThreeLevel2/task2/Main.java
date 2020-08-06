package LessonThreeLevel2.task2;

public class Main {
    public static void main(String[] args) {
        Phonebook phoneBook = new Phonebook();
        phoneBook.addPerson(4564587, "Marly");
        phoneBook.addPerson(12233896, "Mask");
        phoneBook.addPerson(12345678, "Mask");
        phoneBook.addPerson(12345678, "Mask");
        phoneBook.addPerson(12345678, "Rock");

        phoneBook.getInformation("Mask");
        phoneBook.getInformation("Rock");
        phoneBook.getInformation("Carry");
    }
}
