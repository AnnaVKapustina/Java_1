package ru.geekbrains.Lesson_5;

public class Employee {
    private String name;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String name, String email, String phone, int salary, int age) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("Информация о сотруднике " + this.name + ": email: " + this.email + " телефон: " + this.phone + " зарплата: " + this.salary + " возраст: " + this.age);
    }
}
