package LessonSixLevel3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TaskThreeTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 1, 1, 1, 1, 1}, false},
                {new int[]{4,4,4,4,4,4,4,4}, false},
                {new int[]{1, 4, 1, 1}, true},
                {new int[]{1, 4, 8, 7}, false},
                {new int[]{}, false}
        });
    }

    private TaskThree taskThree;
    private int[] in;
    private boolean out;

    public TaskThreeTest(int[] in, boolean out) {
        taskThree = new TaskThree();
        this.in = in;
        this.out = out;
    }

    @Before
    public void startTest() {
        Assert.assertNotNull(taskThree);
    }

    @Test
    public void includesOneOrFourTest() {
        Assert.assertEquals(taskThree.includesOneOrFour(in), out);
    }
}