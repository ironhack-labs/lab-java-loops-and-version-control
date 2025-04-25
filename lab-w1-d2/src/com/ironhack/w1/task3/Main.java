package com.ironhack.w1.task3;

public class Main {
    public static void main(String[] args) {
        int x = 12;
        int y = 3;
        double result = Math.pow(x, 2) + Math.pow((4.0 * y / 5) - x, 2);
        System.out.println("Value " + result);
//        System.out.println("Valor " + (x * x + Math.pow(4 * y / 5.0 - x, 2)));
    }
}
