package FirstLessonLevel2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Cat implements Movement {

    private String name;
    private double maxRunLenght;
    private double maxJumpHight;
    private boolean isDone;

    public Cat(String name, double maxRunLenght, double maxJumpHight) {
        this.name = name;
        this.maxRunLenght = maxRunLenght;
        this.maxJumpHight = maxJumpHight;
    }

    @Override
    public void run(RunningTrack runningTrack) {
        if (maxRunLenght < runningTrack.getTrackLength()) {
            System.out.println(name + " не может пробежать " + runningTrack.getTrackLength() + " метров и сходит с дистанции");
            setDone(false);
        } else {
            System.out.println(name + " пробежал " + runningTrack.getTrackLength() + " метров");
            setMaxRunLenght(maxRunLenght - runningTrack.getTrackLength());
            setDone(true);
        }
    }

    @Override
    public void jump(Wall wall) {
        if (maxJumpHight < wall.getWallHeight()) {
            System.out.println(name + " не может перепрыгнуть стену и сходит с дистанции");
            setDone(false);
        } else {
            System.out.println(name + " перепрыгнул стену ");
            setDone(true);
        }
    }

    @Override
    public boolean isDone() {
        return !this.isDone;
    }
}