package ru.geekbrains.Lesson_7;

public class Plate {

    private int foodQuantity;

    public Plate (int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public void  info() {
        System.out.println("Текущее количество еды: " + foodQuantity);
    }
    public void decreaseFood( int appetite, boolean satiety) {
        if (foodQuantity >= appetite) {
            this.foodQuantity = foodQuantity - appetite;
            satiety = true;
            System.out.println("Кот поел. Сытость: " + satiety);
        } else {
            System.out.println("Для кота слишком мало еды. Сытость: " + satiety);
        }
    }
    public void addFood (int foodQuantity) {
        this.foodQuantity += foodQuantity;
        System.out.println("В тарелку добавили " + foodQuantity + " еды. Текущее количество еды: " + this.foodQuantity);
    }
}
