package LessonSeven;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int wantsToEat) {
        food -= wantsToEat;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void addFood(int addFood) {
        this.food += addFood;
    }
}