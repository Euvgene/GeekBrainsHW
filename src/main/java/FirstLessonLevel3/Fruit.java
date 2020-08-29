package FirstLessonLevel3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Fruit {
   private float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }
}
