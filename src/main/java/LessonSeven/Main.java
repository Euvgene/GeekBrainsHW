package LessonSeven;

public class Main {
    public static void main(String[] args) {
        Cat[] cat = new Cat[5];
        cat[0] = new Cat("Barsik", 85);
        cat[1] = new Cat("Markus", 25);
        cat[2] = new Cat("Fergison", 11);
        cat[3] = new Cat("Belyash", 20);
        cat[4] = new Cat("Balu", 44);
        Plate plate = new Plate(60);
        for (Cat value : cat) {
            value.eat(plate);
            System.out.println("Кот " + value.getName() + " сытый - " + value.isSatiety());
        }
    }
}
