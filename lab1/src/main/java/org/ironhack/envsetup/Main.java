package org.ironhack.envsetup;

import java.util.Arrays;

public class Main {

    // Task 1: difference between largest and smallest
    public static int difference(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int n : arr) {
            if (n > max) max = n;
            if (n < min) min = n;
        }

        return max - min;
    }

    // Task 2: print smallest and second smallest
    public static void printTwoSmallest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array must have at least 2 elements.");
            return;
        }

        Arrays.sort(arr);
        System.out.println("Smallest: " + arr[0]);
        System.out.println("Second smallest: " + arr[1]);
    }

    // Task 3: calculate expression
    public static double calculateExpression(double x, double y) {
        return x * x + (4 * y / 5.0 - x) * (4 * y / 5.0 - x);
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7};

        // Task 1
        int diff = difference(numbers);
        System.out.println("Difference between largest and smallest: " + diff);

        // Task 2
        printTwoSmallest(numbers);

        // Task 3
        double x = 3;
        double y = 10;
        double result = calculateExpression(x, y);
        System.out.println("Task 3 result: " + result);
    }
}
