package LessonSeven;

public class Cat {
    private String name;
    private int wantsToEat;
    private boolean satiety = false;

    public Cat(String name, int wantsToEat) {
        this.name = name;
        this.wantsToEat = wantsToEat;
    }

    public void eat(Plate plate) {
        if (wantsToEat - plate.getFood() <= 0) {
            plate.decreaseFood(wantsToEat);
            setSatiety(true);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWantsToEat() {
        return wantsToEat;
    }

    public void setWantsToEat(int wantsToEat) {
        this.wantsToEat = wantsToEat;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
}