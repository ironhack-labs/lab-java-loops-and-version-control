package org.example;

public class Main {
    static void main(String[] args) {
        int[] array = {102, 10, 100, 200, 61, 21};
        System.out.printf("Difference between max and minimum value: %s\n", differenceMaxMin(array));
        twoSmallestElements(array);

        int x = 1; // Hardcode the variables because the task tells us to do so.
        int y = 2;

        System.out.printf("Result of calculation: %f", calculateMathExpression(x, y));
    }

    // Task 1
    private static int differenceMaxMin(int[] array) {
        if (array.length < 1) {
            return 0;
        }
        int maxValue = 0;
        int minValue = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            maxValue = Math.max(maxValue, array[i+1]);
            minValue = Math.min(minValue, array[i+1]);
        }
        return maxValue - minValue;
    }

    // Task 2
    private static void twoSmallestElements(int[] array) {
        if (array.length < 1) {
            return;
        }
        int minValue = Integer.MAX_VALUE;
        int secondMinValue = Integer.MAX_VALUE;

        for (int value : array) {

            if (value < minValue) {
                secondMinValue = minValue;
                minValue = value;
            } else if (value < secondMinValue && value != minValue) {
                secondMinValue = value;
            }
        }

        System.out.printf("Minimum value: %d\nSecond minimum value: %d\n", minValue, secondMinValue);
    }

    // Task 3
    private static double calculateMathExpression(int x, int y) {
        return (Math.pow(x, 2) + Math.pow(((double) (4 * y) /5 - x), 2));
    }
}