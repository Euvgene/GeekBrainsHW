package LessonFiveLevel3.FirstTask;



public class ThreadClass implements Runnable {
    static volatile char c = 'A';
    static Object obj = new Object();
    private char firstChar;
    private char nextChar;
    private int count = 5;

    public ThreadClass(char firstChar, char nextChar) {
        this.firstChar = firstChar;
        this.nextChar = nextChar;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            synchronized (obj) {
                try {
                    while (c != firstChar) {
                        obj.wait();
                    }
                    System.out.print(firstChar);
                    c = nextChar;
                    obj.notifyAll();
                    if (c == 'A')
                    System.out.print( " | ");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

