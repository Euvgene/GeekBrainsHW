package LessonSevenLvl3;

import java.lang.reflect.Method;

public class Task {
    public static void main(String[] args) throws Exception {
        start(TestClass.class);
        System.out.println("");
        start("LessonSevenLvl3.TestClass");
    }

    public static void start(Class aclass) throws Exception {
        Method[] methods = aclass.getDeclaredMethods();
        Object obj = aclass.newInstance();
        int count = 0;
        for (Method m : methods) {
            if (m.getAnnotation(BeforeSuit.class) != null) {
                if (count == 1) {
                    throw new RuntimeException();
                }
                m.invoke(obj);
                count++;
            }
        }
        for (int i = 1; i < 11; i++) {
            for (Method m : methods) {
                if (m.getAnnotation(Test.class) != null) {
                    Test test = m.getAnnotation(Test.class);
                    if (test.value() == i) {
                        m.invoke(obj);
                        System.out.println("Priority value " + test.value() + ".");
                    }
                }
            }
        }
        int count1 = 0;
        for (Method m : methods) {
            if (m.getAnnotation(AfterSuit.class) != null) {
                if (count1 == 1) {
                    throw new RuntimeException();
                }
                m.invoke(obj);
                count1++;
            }
        }
    }

    public static void start(String name) throws Exception {
        Class aclass = Class.forName(name);
        start(aclass);
    }
}
