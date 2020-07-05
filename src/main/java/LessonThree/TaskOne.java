package LessonThree;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        int minLimit = 0;
        int maxLimit = 10;
        int guessedNumber = (int) ((Math.random() * maxLimit) + minLimit);
        int tryCount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Отгадайте число от " + minLimit + " до " + (maxLimit - 1) + ".");
        //Счетчик
        while (tryCount < 3) {
            int userInput = userInputnumber(minLimit, maxLimit);
            if (userInput == guessedNumber) {
                System.out.printf("%n" + "Поздравляю, вы угадали!");
                break;
            } else if (userInput != guessedNumber && tryCount == 2) {
                System.out.printf("%n" + "Вы проиграли! ");
                userInput = tryAgainQuestion(1, 0);
                // Начать игру заного
                if (userInput == 1) {
                    guessedNumber = (int) ((Math.random() * maxLimit) + minLimit);
                    System.out.printf("%n" + "Загаданно новое число от " + minLimit + " до " + (maxLimit - 1) + ".");
                    tryCount -= tryCount + 1;
                } else {
                    break;
                }
                //Сравнение
            } else if (userInput > guessedNumber) {
                System.out.printf("%n" + "Загаданное число меньше, попробуйте еще раз!");
            } else {
                System.out.printf("%n" + "Загаданное число больше, попробуйте еще раз!");
            }
            tryCount++;
        }
        sc.close();
    }

    public static int userInputnumber(int minLimit, int maxLimit) {
        int userInput;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.printf("%n" + "Введите число от " + minLimit + " до " + (maxLimit - 1) + ": ");
            while (!sc.hasNextInt()) {
                System.out.println("Вы ввели не число! ");
                System.out.printf("%n" + "Введите число от " + minLimit + " до " + (maxLimit - 1) + ": ");
                sc.next();

            }
            userInput = sc.nextInt();
            if (userInput < minLimit || userInput >= maxLimit) {
                System.out.println("Ошибка ввода!");
            }
        } while (userInput < minLimit || userInput > maxLimit);
        return userInput;

    }

    public static int tryAgainQuestion(int yes, int no) {
        int userInput;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.printf("%n" + "«Повторить игру еще раз? 1 – да / 0 – нет: ");
            while (!sc.hasNextInt()) {
                System.out.println("Вы ввели не число! ");
                System.out.printf("%n" + "«Повторить игру еще раз? 1 – да / 0 – нет: ");
                sc.next();
            }
            userInput = sc.nextInt();
            if (userInput != 0 && userInput != 1) {
                System.out.println("Ошибка ввода!");
            }
        } while (userInput != 1 && userInput != 0);
        return userInput;
    }
}


