package FirstLessonLevel3;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;

@ToString
@Getter
@Setter
public class FirstAndSecondTask<T> {

    private T[] arr;

    public FirstAndSecondTask(T[] arr) {
        this.arr = arr;
    }

    public void replaceTwoElementsInArray(int firstNum, int secondNum) {
        try {
            T t = arr[secondNum];
            arr[secondNum] = arr[firstNum];
            arr[firstNum] = t;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Wrong index. Array has not changed");
        }
    }

    public ArrayList<T> arrayToArrayList() {
        return new ArrayList<>(Arrays.asList(arr));
    }
}