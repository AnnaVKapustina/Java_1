package ru.geekbrains.Lesson_6;

public class Test {

    public static void main(String[] args) {
        Cat cat = new Cat("Mars", "black", 3);
        Dog dog = new Dog("Jack", "white", 5);
        Dog dog2 = new Dog("Lassy", "ginger", 2);

        cat.run(100);
        cat.run(500);
        cat.swim(100);
        dog.run(300);
        dog.run(800);
        dog.swim(5);
        dog2.swim(20);
        System.out.println("Cats created: " + Cat.count);
        System.out.println("Dogs created: " + Dog.count);
        System.out.println("Animals created: " + Animal.count);
    }
}
