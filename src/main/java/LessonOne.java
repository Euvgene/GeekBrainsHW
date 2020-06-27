public class LessonOne {

    byte b = 8; //Задание 2
    short s = 11566; //Задание 2
    int i = 32023; //Задание 2
    long l = 6454624L; //Задание 2
    float f = 10.1f; //Задание 2
    double d = 10.5; //Задание 2
    char c = 'A'; //Задание 2
    boolean bool = true; //Задание 2
    String str = "Евгений"; // Задание 2

    public static void main(String[] args) { // Задание 1
        System.out.println(expression(10, 11, 12, 1)); // Для проверки вывод в консоль
        System.out.println(comparison(10, 2)); // Для проверки вывод в консоль
        positive(-1);
        System.out.println(negative(2)); // Для проверки вывод в консоль
        name("Евгений");
        leap(7);

    }

    public static int expression(int a, int b, int c, int d) { // Задание 3
        int exp;
        return exp = a * (b + (c / d));
    }

    public static boolean comparison(double compFirst, double compSecond) { // Задание 4
        return (compFirst + compSecond) >= 10 && (compFirst + compSecond) <= 20;
    }

    public static void positive(double pos) { // Задание 5
        if (pos >= 0) {
            System.out.println("Число положительное!");
        } else {
            System.out.println("Число отрицательное!");
        }
    }

    public static boolean negative(int negNumber) { // Задание 6
        return negNumber <= 0;
    }

    public static void name(String myName) { // Задание 7
        System.out.println("Привет, " + myName + "!");
    }

    public static void leap(int year) { // Задание 8
        if (year % 100 == 0 && year % 400 != 0) {
            System.out.println(year + " год - не високосный.");
        } else if (year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " год - високосный.");
        } else {
            System.out.println(year + " год - не високосный.");
        }
    }
}
