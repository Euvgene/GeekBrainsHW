package LessonSixLevel3;

public class TaskThree {
    public boolean includesOneOrFour(int[] arr) {
        boolean one = false;
        boolean four = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                one = true;
            } else if (arr[i] == 4) {
                four = true;
            } else {
                return false;
            }
        }
        return one && four;
    }
}
