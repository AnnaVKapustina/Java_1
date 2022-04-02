package ru.geekbrains.Lesson_6;

public class Cat extends Animal {
    static int count;
    public Cat(String name, String color, int age) {
        super(name, color, age);
        count++;
    }
    @Override
    public void swim(int distance) {
        System.out.println("The cat " + this.name + " can't swim");
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            super.run(distance);
        } else {
            System.out.println("The cat " + this.name + " can't run " + distance + " meters");
        }
    }
}
