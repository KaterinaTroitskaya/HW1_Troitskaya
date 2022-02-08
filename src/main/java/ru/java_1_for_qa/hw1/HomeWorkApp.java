package ru.java_1_for_qa.hw1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    //region Task2
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    //endregion
    //region Task3
    public static void checkSumSign() {
        int a = 1;
        int b = 2;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    //endregion
    //region Task4
    public static void printColor() {
        int value = (int) Math.random();
        if (value <=0) {
            System.out.println("Красный");
        } else if (value<=100){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    //endregion
    //region Task5
    public static void compareNumbers() {
        int a = (int) Math.random();
        int b = (int) Math.random();
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    //endregion

}
