package LessonSix;

public class Animal {

    public double runLenght;
    public double swimLenght;
    public double jumpHeight;
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public void run(double distance) {
        if (distance < runLenght && distance > 0) {
            System.out.println(name + " пробежит " + distance + " м");
        } else {
            System.out.println(name + " не пробежит " + distance + " м");
        }
    }

    public void swim(double distance) {
        if (distance < swimLenght && distance > 0) {
            System.out.println(name + " проплывет " + distance + " м");
        } else {
            System.out.println(name + " не проплывет " + distance + " м");
        }
    }

    public void jump(double distance) {
        if (distance < jumpHeight && distance > 0) {
            System.out.println(name + " подпрыгнет на " + distance + " м");
        } else {
            System.out.println(name + " не подпрыгнет на " + distance + " м");
        }
    }
}