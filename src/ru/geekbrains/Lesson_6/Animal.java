package ru.geekbrains.Lesson_6;

public class Animal {
    protected final String name;
    protected final String color;
    protected final int age;
    static int count;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        count++;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void run(int distance) {
        System.out.println(this.name + " run " + distance + " meters");
    }
    public void swim (int distance) {
        System.out.println(this.name + " swam " + distance + " meters");
    }
}
