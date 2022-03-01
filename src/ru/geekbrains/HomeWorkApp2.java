package ru.geekbrains;

public class HomeWorkApp2 {
    public static void main(String[] args) {

        System.out.println(checkSum(4,5));
        System.out.println("-------------------");
        checkNumber(-8);
        System.out.println("-------------------");
        System.out.println(checkNumber2(10));
        System.out.println("-------------------");
        printString(3, "Привет!");
        System.out.println("-------------------");
        System.out.println(leapYear(2100));
    }
    private  static boolean checkSum (int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }
    //----------------------------------------------
    private static void checkNumber (int a) {
        if (a >= 0) {
            System.out.println(a + " Положительное число");
        } else {
            System.out.println(a + " Отрицательное число");
        }
    }
    //----------------------------------------------
    private static boolean checkNumber2 (int b) {
        if (b >= 0) {
            return false;
        } else {
            return true;
        }
    }
    //-----------------------------------------------
    private static void printString (int a, String b) {
        for (int i = 0; i < a; i++) {
            System.out.println(b);
        }
    }
    //-----------------------------------------------
    private static boolean leapYear (int a) {
        if ((a % 4) != 0) {
            return false;
        } else if ((a % 400 == 0)) {
            return true;
        } else if ((a % 100 == 0)) {
            return false;
        } else {
            return true;
        }
    }
}
