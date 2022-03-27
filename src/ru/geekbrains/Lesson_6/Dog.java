package ru.geekbrains.Lesson_6;

public class Dog extends Animal {
    static int count;
    public Dog(String name, String color, int age) {
        super(name, color, age);
        count++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            super.run(distance);
        } else {
            System.out.println("The dog " + this.name + " can't run " + distance + " meters");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            super.swim(distance);
        } else {
            System.out.println("The dog " + this.name + " can't swim " + distance + " meters");
        }
    }
}
