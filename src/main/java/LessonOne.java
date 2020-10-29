public class LessonOne {

    //Задание 2
    byte b = 8;
    short s = 11566;
    int i = 32023;
    long l = 6454624L;
    float f = 10.1f;
    double d = 10.5;
    char c = 'A';
    boolean bool = true;
    String str = "Евгений";

    //Задание 1
    public static void main(String[] args) {
        expression(10, 11, 12, 1);
        isInLimit(9.1, 0.9);
        number(-1);
        isNegative(-1);
        getName("Евгений");
        leapYear(4);
    }

    // Задание 3
    public static int expression(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    // Задание 4
    public static boolean isInLimit(double firstNum, double secondNum) {
        double sum = firstNum + secondNum;
        return sum >= 10 && sum <= 20;
    }

    // Задание 5
    public static void number(double myNumber) {
        if (myNumber >= 0)
            System.out.println("Число положительное!");
        else
            System.out.println("Число отрицательное!");
    }

    // Задание 6
    public static boolean isNegative(int negNumber) {
        return negNumber <= 0;
    }

    // Задание 7
    public static void getName(String myName) {
        System.out.println("Привет, " + myName + "!");
    }

    // Задание 8
    public static void leapYear(int year) {
        if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0)
            System.out.println(year + " год - не високосный.");
        else
            System.out.println(year + " год - високосный.");
    }
}

