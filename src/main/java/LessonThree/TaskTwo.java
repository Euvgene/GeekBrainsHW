package LessonThree;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        String[] wordList = {"apple", "orange", "lemon",
                "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int index = (int) (Math.random() * wordList.length);
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%n" + "Загадано слово! Попробуйте его отгадать - ");
        String userInput = scanner.nextLine();
        String invisiable = "###############";
        String finalWord = "";

        for (int i = 0; i < wordList[index].length(); i++) {
            if (i < userInput.length()) {
                if (wordList[index].equals(userInput)) {
                    System.out.printf("%n" + "Вы отгадали! Поздравляю! Загаданное слово - " + userInput + ".");
                    break;
                }
                if (wordList[index].charAt(i) == userInput.charAt(i)) {
                    finalWord = finalWord + userInput.charAt(i);
                    if (i == wordList[index].length() - 1) {
                        System.out.printf("%n" + "Найдено совпадений " + finalWord + invisiable + " попробуйте еще раз - ");
                        userInput = scanner.nextLine();
                        finalWord = "";
                        i = -1;
                    }
                } else if (i == wordList[index].length() - 1) {
                    System.out.printf("%n" + "Найдено совпадений " + finalWord + invisiable + " попробуйте еще раз - ");
                    userInput = scanner.nextLine();
                    finalWord = "";
                    i = -1;
                } else {
                    finalWord = finalWord + "#";
                }
            } else {
                System.out.printf("%n" + "Найдено совпадений " + finalWord + invisiable + " попробуйте еще раз - ");
                userInput = scanner.nextLine();
                finalWord = "";
                i = -1;
            }
        }
        scanner.close();
    }
}