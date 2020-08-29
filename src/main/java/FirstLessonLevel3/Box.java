package FirstLessonLevel3;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;

@Getter
@Setter
public class Box<T extends Fruit> {
    private ArrayList<T> box;

    public Box(T... fruits) {
        box = new ArrayList<>(Arrays.asList(fruits));
    }

    public void addFruit(T fruit) {
        box.add(fruit);
    }

    public float getWeight() {
        float weight = 0.0f;
        for (int i = 0; i < box.size(); i++) {
            weight += box.get(i).getWeight();
        }
        return weight;
    }

    public boolean compareBoxes(Box<? extends Fruit> someBox) {
        return Math.abs(getWeight() - someBox.getWeight()) < 0.0001f;
    }

    public void replaceFruitsToAnotherBox(Box<T> newBox) {
        newBox.box.addAll(this.box);
        this.box.clear();
    }
}
