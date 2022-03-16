package ru.geekbrains;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        changeNumber();
        System.out.println("Задание 2");
        arrayOneHundred();
        System.out.println("Задание 3");
        multiplyTwo();
        System.out.println("Задание 4");
        multiArray();
        System.out.println("Задание 5");
        arrayScanner();
        System.out.println("Задание 6");
        arrayMaxMin();
    }
    private static void changeNumber () {
        int[] array = {1, 0, 0, 1, 1, 0, 1, 0 ,1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
    private static void arrayOneHundred() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }
    private static void multiplyTwo() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }
    private static void multiArray() {
        int[][] array = new int[4][];
        array[0] = new int[4];
        array[1] = new int[4];
        array[2] = new int[4];
        array[3] = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i][array.length - (i + 1)] = 1;
            for (int j = 0; j < array[i].length; j++) {
                if (j == i) {
                    array[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(array[i]));
        }
    }
    private static void arrayScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int len = scanner.nextInt();
        System.out.println("Введите значение для ячеек массива");
        int initialValue = scanner.nextInt();
        int[] array = new int[len];
            for (int i = 0; i < array.length; i++) {
                array[i] = initialValue;
            }
        System.out.println(Arrays.toString(array));
    }
    private static void arrayMaxMin() {
        int[] array = {1, 2, 45, 67, 2, 6, 17, 0, 78, -9, 3};
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.printf("Максимальный элемент массива - %d %n", max);
        System.out.printf("Минимальный элемент массива - %d", min);
    }
}
