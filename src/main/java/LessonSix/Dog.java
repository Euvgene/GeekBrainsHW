package LessonSix;

public class Dog extends Animal {
    public double maxRunLenght = Math.random() * 1000;
    public double maxSwimLenght = Math.random() * 200;
    public double maxJumpHeight = Math.random() * 1.5;

    public Dog(String name) {
        super(name);
        super.runLenght = maxRunLenght;
        super.swimLenght = maxSwimLenght;
        super.jumpHeight = maxJumpHeight;
    }
}