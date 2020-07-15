package LessonSix;

public class Cat extends Animal {
    public double maxRunLenght = Math.random() * 550;
    public double maxJumpHeight = Math.random() * 2;


    public Cat(String name) {
        super(name);
        super.runLenght = maxRunLenght;
        super.jumpHeight = maxJumpHeight;
    }

    @Override
    public void swim(double distance) {
        System.out.println("Простите, кошка не умеет плавать!");
    }
}