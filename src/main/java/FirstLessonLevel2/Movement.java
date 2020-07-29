package FirstLessonLevel2;

public interface Movement {

    void run(RunningTrack runningTrack);

    void jump(Wall wall);

    boolean isDone();
}