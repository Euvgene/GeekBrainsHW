package LessonFiveLevel2;

public class Main {

    private static final int size = 10000000;
    private static final int h = size / 2;
    float[] arr = new float[size];
    public static void main(String[] args) {
        Main main = new Main();
        main.methodOne();
        main.methodTwo();
    }

    private void methodOne() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Completion of method one. Runtime " + (System.currentTimeMillis() - a) + " milliseconds.");
    }

    private void methodTwo() {
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        System.out.println("Array split time " + (System.currentTimeMillis() - a) + " milliseconds.");
        Thread thread1 = new Thread(() -> {
            NewArrayElements(a1, 1);
        });
        Thread thread2 = new Thread(() -> {
            NewArrayElements(a2, 2);
        });
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        long merge = System.currentTimeMillis();
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        System.out.println("The time it takes to merge the array " + (System.currentTimeMillis() - merge) + " milliseconds.");
        System.out.println("Completion of method two. Runtime " + (System.currentTimeMillis() - a) + " milliseconds.");
    }

    private void NewArrayElements(float[] arr, int number) {
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Thread number " + number + " execution time " + (System.currentTimeMillis() - a) + " milliseconds.");
    }
}