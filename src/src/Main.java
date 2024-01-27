import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = new int[]{9, 5, 6, 2, 3};
        int x = 5;
        int y =10;

        // Task 1 Test
        System.out.println("Task 1:");
        System.out.println("The difference between the largest and smallest value is: " + calculateDifference(values));

        // Task 2 Test
        System.out.println("Task 2:");
        printTwoSmallestValues(values);

        // Task 3 Test
        System.out.println("Task 3:");
        System.out.println("The result of the mathematical expression is: " + calculateResult(x, y));

    }

    // Task 1
    // Write a Java method that returns the difference between the largest and smallest values in an array of integers.
    // The length of the array must be at least 1.
    public static int calculateDifference(int[] values) {
        int largestValue = values[0];
        int smallestValue = values[0];

        for(int i = 1; i < values.length; ++i) {
            if (values[i] > largestValue) {
                largestValue = values[i];
            }

            if (values[i] < smallestValue) {
                smallestValue = values[i];
            }
        }

        return largestValue - smallestValue;
    }

    // Task 2
    // Write a Java method that finds the smallest and second smallest elements of a given array and prints them to the
    // console.
    public static void printTwoSmallestValues(int[] values) {
        Arrays.sort(values);
        int smallestValue = values[0];
        int secondSmallestValue = values[1];

        System.out.println("The smallest element is: " + smallestValue);
        System.out.println("The second smallest element is: " + secondSmallestValue);
    }

    // Task 3
    // Write a Java method that calculates the result of the following mathematical expression, where x and y are two
    // variables that have been pre-set in your code.
    public static double calculateResult(int x, int y) {
        return Math.pow(x, 2) + Math.pow((4 * y) / 5 - x, 2);
    }



}