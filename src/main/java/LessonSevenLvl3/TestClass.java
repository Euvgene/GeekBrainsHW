package LessonSevenLvl3;

public class TestClass {

    @BeforeSuit
    public void beforSuitTest() {
        System.out.println("Before test method.");
    }

    @Test(1)
    public void testOnePriority() {
        System.out.print("One priority test. ");
    }

    @Test(2)
    public void testTwoPriority() {
        System.out.print("Two priority test. ");
    }

    @Test(3)
    public void testThreePriority() {
        System.out.print("Three priority test. ");
    }
    @Test()
    public void testFourPriority() {
        System.out.print("Four, default priority test. ");
    }

    @Test(5)
    public void testFivePriorityFirst() {
        System.out.print("Five(1) priority test. ");
    }

    @Test(5)
    public void testFivePrioritySecond() {
        System.out.print("Five(2) priority test. ");
    }

    @Test(6)
    public void testSixPriority() {
        System.out.print("Six priority test. ");
    }

    @Test(7)
    public void testSevenPriority() {
        System.out.print("Seven priority test. ");
    }

    @Test(8)
    public void testEightPriority() {
        System.out.print("Eight priority test. ");
    }

    @Test(9)
    public void testNinePriority() {
        System.out.print("Nine priority test. ");
    }

    @Test(10)
    public void testTenPriority() {
        System.out.print("Ten priority test. ");
    }

    @AfterSuit
    public void afterSuitTest() {
        System.out.println("After test method.");
    }
}