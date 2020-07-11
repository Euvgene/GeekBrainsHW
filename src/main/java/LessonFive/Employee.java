package LessonFive;

public class Employee {

    public String name;
    public String position;
    public String email;
    public String phoneNumber;
    public int salary;
    public int age;

    public Employee(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void getInfo() {
        System.out.printf("%-15s%-15s%-26s%-17s%-10s%3s%n", name, position, email, phoneNumber, salary, age);
    }

    public int getAge() {
        return age;
    }
}







