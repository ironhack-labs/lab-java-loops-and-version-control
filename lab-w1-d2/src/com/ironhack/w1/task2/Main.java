package com.ironhack.w1.task2;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // TASK TWO
        int[] numbers = {5, 12, 1, 2, 3,7,0, 4, 6, 8};

        int max = numbers[0];
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                max = min;
                min = number;
            }
            if (number < max && number != min){
                max = number;
            }
        }
        System.out.println("Smallest " + min);
        System.out.println("Second Smallest " + max);
    }
}