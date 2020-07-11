package LessonFive;

public class Main {

    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Jack Smith", "cook", "jacksmith@gmail.com", "8-921-854-25-64", 35000, 45);
        employeeArray[1] = new Employee("Oliver Johns", "cleaner", "oliverjohns@gmail.com", "8-921-123-85-67", 25000, 55);
        employeeArray[2] = new Employee("Harry Brown", "manager", "harrybrown@gmail.com", "8-921-753-95-17", 45000, 33);
        employeeArray[3] = new Employee("Charlie Taylor", "sommelier", "charlietaylor@gmail.com", "8-921-152-45-65", 50000, 40);
        employeeArray[4] = new Employee("Thomas Davies", "waiter", "thomasdavies@gmail.com", "8-999-254-15-26", 15000, 23);
        System.out.printf("%-15s%-15s%-26s%-17s%-10s%3s%n", "Имя сотрудника", "Должность", "Электронная почта", "Номер телефона", "Зарплата", " Возраст");
        for (Employee employee : employeeArray) {
            if (employee.getAge() > 39) {
                employee.getInfo();
            }
        }
    }
}