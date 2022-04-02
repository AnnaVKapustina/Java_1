package ru.geekbrains.Lesson_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        System.out.println("Кот " + this.name + " начал есть " + appetite);
        plate.decreaseFood(appetite, satiety);
    }

}
