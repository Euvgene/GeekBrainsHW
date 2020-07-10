package LessonFour;

import java.util.Arrays;
import java.util.Scanner;

public class TaskTwo {
    public static Scanner sc = new Scanner(System.in);
    public static char[][] map;
    public final static char DOT_X = 'X';
    public final static char DOT_O = 'O';
    public final static char EMPTY_DOT = '•';
    public static final int DOTS_TO_WIN = 3;
    public static final int MAP_SIZE = 3;

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            playerTurn();
            printMap();
            if (isWin(DOT_X, 0, 0)) {
                System.out.println("ВЫ ВЫИГРАЛИ!");
                break;
            }
            if (checkDraw()) {
                System.out.println("Свободные клетки закончились. Победителя нет!");
                break;
            }
            aITurn();
            printMap();
            if (isWin(DOT_O, 0, 0)) {
                System.out.println("ВЫ ПРОИГРАЛИ(((((((!");
                break;
            }
            if (checkDraw()) {
                System.out.println("Свободные клетки закончились. Победителя нет!");
                break;
            }
        }
        sc.close();
    }


    private static void initMap() {
        map = new char[MAP_SIZE][MAP_SIZE];
        for (int i = 0; i < MAP_SIZE; i++) {
            for (int j = 0; j < MAP_SIZE; j++) {
                map[i][j] = EMPTY_DOT;
            }
        }
    }

    private static void printMap() {
        for (int i = 0; i < MAP_SIZE; i++) {
            System.out.print("  " + (i + 1));
        }
        System.out.println();
        for (int i = 0; i < MAP_SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < MAP_SIZE; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void playerTurn() {
        int x, y;
        System.out.println("Пожалуйста, введите координаты хода в формате- x, y");
        do {
            x = sc.nextInt();
            y = sc.nextInt();
        } while (!isTurnValid(x - 1, y - 1));
        map[y - 1][x - 1] = DOT_X;
    }

    private static boolean checkDraw() {
        int count = 0;
        for (int i = 0; i < MAP_SIZE; i++) {
            for (int j = 0; j < MAP_SIZE; j++) {
                if (map[i][j] == EMPTY_DOT) {
                    count++;
                }
            }
        }
        return count == 0;
    }

    private static void aITurn() {
        int x, y;
        do {
            x = (int) (Math.random() * MAP_SIZE);
            y = (int) (Math.random() * MAP_SIZE);
        } while (!isTurnValid(x, y));
        map[y][x] = DOT_O;
    }

    private static boolean isTurnValid(int x, int y) {
        if (x < 0 || x > MAP_SIZE - 1 || y < 0 || y > MAP_SIZE - 1) {
            return false;
        }
        if (map[y][x] == EMPTY_DOT) {
            return true;
        }
        return false;
    }

    private static boolean isWin(char symbol, int x, int y) {
        char[] win = new char[DOTS_TO_WIN];
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            win[i] = symbol;
        }
        char[] iswin = new char[DOTS_TO_WIN];
        for (int i = y; i < DOTS_TO_WIN + y; i++) {
            for (int j = x; j < DOTS_TO_WIN + x; j++) {
                if (map[i][j] == symbol) {
                    iswin[j - x] = symbol;
                    if (Arrays.equals(win, iswin)) {
                        return true;
                    }
                } else {
                    break;
                }
            }
        }
        iswin = new char[DOTS_TO_WIN];
        for (int i = y, j = x; i < DOTS_TO_WIN + y; i++, j++) {
            if (map[i][j] == symbol) {
                iswin[i - y] = symbol;
                if (Arrays.equals(win, iswin)) {
                    return true;
                }
            }
        }

        iswin = new char[DOTS_TO_WIN];
        for (int i = y, j = x + DOTS_TO_WIN - 1; i < DOTS_TO_WIN + y; i++, j--) {
            if (map[i][j] == symbol) {
                iswin[i - y] = symbol;
                if (Arrays.equals(win, iswin)) {
                    return true;
                }
            }
        }
        iswin = new char[DOTS_TO_WIN];
        for (int j = x; j < DOTS_TO_WIN + x; j++) {
            for (int i = y; i < DOTS_TO_WIN + y; i++) {
                if (map[i][j] == symbol) {
                    iswin[i - y] = symbol;
                    if (Arrays.equals(win, iswin)) {
                        return true;
                    }
                } else {
                    break;
                }
            }
        }
        return false;
    }
}