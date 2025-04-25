package com.ironhack.w1.task1;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // TASK ONE
        int[] numbers = {5, 12, 1, 2, 3, 4, 6, 8};
        if (numbers.length < 1) {
            System.out.println("The length of the array must be at least 1.");
            return;
        }
        int[] returnMax = calculateDifferences(numbers);
    }

    public static int[] calculateDifferences(int[] numbers) {
        int[] returnMax = new int[numbers.length];
        int[] returnMin = new int[numbers.length];
        int max = numbers[0];
        int min = numbers[0];
        for (int number : numbers) {
            if (number >= max) {
                max = number;
            }
            if (number <= min) {
                min = number;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            returnMax[i] = max - numbers[i];
            returnMin[i] = numbers[i] - min;
        }
        System.out.println("Maximo " + max);
        System.out.println("Minimo " + min);
        System.out.println("Diferenca pro maior: " + Arrays.toString(returnMax));
        System.out.println("Diferenca pro menor: " + Arrays.toString(returnMin));
        return(returnMax);
    }
}