package LessonFourLevel3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.*;

public class MainTwo {
    public static void main(String[] args) {
        MainTwo main = new MainTwo();
        System.out.println(main.search(4, new Integer[]{1, 2, 3, 4, 5, 6, 7}));
        System.out.println(main.reverse("Hello"));
        System.out.println(main.maximum(new Integer[]{1, 2, 5, 6, 4, 5, 4, 8}));
        System.out.println(main.average(Arrays.asList(1, 2, 3, 4)));
        System.out.println(main.search(Arrays.asList("aid", "acdc", "app","adf")));
    }

    public int search(Integer n, Integer[] list) {
        return integerFunction.apply(n, list);
    }

    static BiFunction<Integer, Integer[], Integer> integerFunction = (x, y) -> {
        for (int i = 0; i < y.length; i++) {
            if (y[i].equals(x)) {
                return i;
            }
        }
        return -1;
    };

    public String reverse(String s) {
        return stringFunction.apply(s);
    }

    static Function<String, String> stringFunction = s -> {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result = s.charAt(i) + result;
        }
        return result;
    };

    public Integer maximum(Integer[] list) {
        return maxValueFunction.apply(list);
    }

    Function<Integer[], Integer> maxValueFunction = x -> {
        int maxValue = x[0];
        for (int i = 0; i < x.length; i++) {
            if (x[i] > maxValue) {
                maxValue = x[i];
            }
        }
        return maxValue;
    };

    public Double average(List<Integer> list) {
        return doubleFunction.apply(list);
    }

    Function<List<Integer>, Double> doubleFunction = x -> {
        Double sum = 0.0;
        if (!x.isEmpty()) {
            for (Integer y : x) {
                sum += y;
            }
        }
        return sum / x.size();
    };

    public List<String> search(List<String> list) {
        return listFunction.apply(list);
    }

    Function<List<String>, List<String>> listFunction = x -> {
        List<String> stringList = new ArrayList<>();
        for (String s : x) {
            if (s.startsWith("a") && s.length() == 3) {
                stringList.add(s);
            }
        }
        return stringList;
    };
}