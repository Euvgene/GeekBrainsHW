package LessonSixLevel3;

import java.util.Arrays;

public class TaskTwo {
    public int[] arrAfterLastFour(int[] arr) throws RuntimeException {
        String str = Arrays.toString(arr);
        int n = 0;
        if (str.contains(String.valueOf(4))) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 4) {
                    n = i;
                }
            }
            int[] newArray = new int[arr.length - n - 1];
            System.arraycopy(arr, n + 1, newArray, 0, newArray.length);
            return newArray;
        } else {
            throw new RuntimeException("Number four not found");
        }
    }
}
