package ru.geekbrains.Lesson_5;

public class Team {

    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Иванов Иван", "qwerty@mail.ru", "+79099999999", 1000, 45);
        employeesArray[1] = new Employee("Петров Петр", "asdfg@mail.ru", "+79033333333", 2000, 30);
        employeesArray[2] = new Employee("Антонов Антон", "zxcvb@mail.ru", "+79990001122", 3000, 37);
        employeesArray[3] = new Employee("Миронова Мария", "lkjhg@yandex.ry", "+79524445566", 2500, 25);
        employeesArray[4] = new Employee("Сидорова Анна", "ghjk@yandex.ru", "+79451112288", 1500, 42);
        ageForty(employeesArray);
    }
    public static void ageForty(Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getAge() > 40) {
                array[i].info();
            }
        }
    }
}
