package LessonFourLevel3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        averegeList(inter4, Arrays.asList(1, 2, 3, 4, 5));
        maxValue(inter3, new Integer[]{1, 2, 3, 45, 4});
        reverseline(inter2, "Hello");
        returnIndex(inter1, 1, new Integer[]{2, 1, 3});
        specialList(inter5, Arrays.asList("Action", "act", "add", "Apetite"));
    }

    static FirstTaskInter inter1 = (x, y) -> {
        for (int i = 0; i < y.length; i++) {
            if (y[i].equals(x)) {
                return i;
            }
        }
        return -1;
    };

    static SecondTaskInter inter2 = s -> {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result = s.charAt(i) + result;
        }
        return result;
    };

    static ThirdTaskInter inter3 = x -> {
        int maxValue = x[0];
        for (int i = 0; i < x.length; i++) {
            if (x[i] > maxValue) {
                maxValue = x[i];
            }
        }
        return maxValue;
    };

    static TaskFourInter inter4 = x -> {
        Double sum = 0.0;
        if (!x.isEmpty()) {
            for (Integer y : x) {
                sum += y;
            }
            return sum / x.size();
        }
        return sum;
    };

    static TaskFiveInter inter5 = x -> {
        List<String> stringList = new ArrayList<>();
        for (String s : x) {
            if (s.startsWith("a") && s.length() == 3) {
                stringList.add(s);
            }
        }
        return stringList;
    };

    private static void specialList(TaskFiveInter inter, List<String> list) {
        System.out.println(inter.search(list));
    }

    private static void averegeList(TaskFourInter inter, List<Integer> list) {
        System.out.println(inter.average(list));
    }

    private static void maxValue(ThirdTaskInter inter, Integer[] integers) {
        System.out.println(inter.maximum(integers));
    }

    private static void reverseline(SecondTaskInter inter, String s) {
        System.out.println(inter.reverse(s));
    }

    public static void returnIndex(FirstTaskInter inter, Integer n, Integer[] list) {
        System.out.println(inter.search(n, list));
    }
}