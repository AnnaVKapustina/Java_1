package ru.geekbrains.Lesson_7;

public class Test {

    public static void main(String[] args) {
        Cat[] catArray = new Cat[3];
        catArray[0] = new Cat("Барсик", 10, false);
        catArray[1] = new Cat("Коржик", 20, false);
        catArray[2] = new Cat("Компот", 30, false);
        Plate plate = new Plate(50);

        plate.info();
        for (int i = 0; i < catArray.length; i++) {
            catArray[i].eat(plate);
        }
        plate.info();
        plate.addFood(10);
    }
}
