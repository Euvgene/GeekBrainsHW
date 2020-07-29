package FirstLessonLevel2;

public class Main {
    public static void main(String[] args) {

        Movement[] participant = new Movement[3];
        participant[0] = new  Human("Maks",1826.2,1);
        participant[1] = new Robot("R2D2", 2563.1, 1.4);
        participant[2] = new Cat("Belyash", 1125.4, 1.6);

        Object[] objects = new Object[4];
        objects[0] = new Wall(0.9);
        objects[1] = new RunningTrack(1000);
        objects[2] = new Wall(1.3);
        objects[3] = new RunningTrack(1500);

        for (Movement obstacle : participant) {
            for (Object object : objects) {
                if (object instanceof RunningTrack) {
                    obstacle.run((RunningTrack) object);
                    if (obstacle.isDone()) {
                        break;
                    }
                } else if (object instanceof Wall) {
                    obstacle.jump((Wall) object);
                    if (obstacle.isDone()) {
                        break;
                    }
                }
            }
        }
    }
}