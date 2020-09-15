package LessonFiveLevel3.FirstTask;

public class Main {
    public static void main(String[] args) {
        new Thread(new ThreadClass('A', 'B')).start();
        new Thread(new ThreadClass('B', 'C')).start();
        new Thread(new ThreadClass('C', 'A')).start();
    }
}

