package LessonSixLevel3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class TaskTwoTest {
    @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 3, 4, 5, 6}, new int[]{5, 6}},
                {new int[]{1, 2, 3, 4}, new int[]{}}
        });
    }
    private TaskTwo taskTwo;
    private int[] in;
    private int[] out;

    public TaskTwoTest(int[] in, int[] out) {
        taskTwo = new TaskTwo();
        this.in = in;
        this.out = out;
    }

    @Before
    public void startTest() {
        Assert.assertNotNull(taskTwo);
        Assert.assertNotNull(data());
    }

    @Test
    public void arrAfterLastFourTest() {
        Assert.assertArrayEquals(out, taskTwo.arrAfterLastFour(in));
    }

    @Test(expected = RuntimeException.class)
    public void testAfterLast4Ex() {
        taskTwo.arrAfterLastFour(new int[]{1,2,3,5,6});
    }
}