package LessonThreeLevel2.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int j = 1;
        String[] words = new String[]{"food", "food", "food", "cover", "plant", "hard",
                "farm", "left", "late", "press", "press", "press", "north", "book",
                "few", "north", "north", "gun", "stop", "start", "food", "hear", "food"};
        Set<String> setUniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println("Уникальные слова - " + setUniqueWords);
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(words));
        while (!wordsList.isEmpty()) {
            int i = wordsList.size();
            String word = wordsList.get(0);
            wordsList.removeAll(Collections.singletonList(word));
            if (i != wordsList.size() + j) {
                System.out.println(word + " повторяется " + (i - wordsList.size()) + " раз(а)");
            } else {
                System.out.println(word + " повторяется " + j + " раз");
            }
        }
    }
}
