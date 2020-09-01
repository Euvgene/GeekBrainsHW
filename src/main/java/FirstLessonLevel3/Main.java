package FirstLessonLevel3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] i = new Integer[]{1, 2, 3};
        Integer[] i1 = new Integer[]{1, 3, 5};
        replaceTwoElementsInArray(i, 1, 0);
        System.out.println(arrayToArrayList(i1));
    }

    public static <T> void replaceTwoElementsInArray(T[] arr, int firstNum, int secondNum) {
        try {
            T t = arr[secondNum];
            arr[secondNum] = arr[firstNum];
            arr[firstNum] = t;
            System.out.println(Arrays.toString(arr));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Wrong index. Array has not changed");
        }
    }

    public static <T> ArrayList <T> arrayToArrayList(T[] arr) {
        ArrayList<T> result = null;
        if (arr != null && arr.length > 0) {
            result = new ArrayList<>();
            for (T t : arr) {
                result.add(t);
            }
        } else if (arr != null) {
            result = new ArrayList<>();
        }
        return result;
    }
}