import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 8, 12, 3, 10};

        //Task 1 - Write a Java method that returns the difference between the largest and smallest values in an array of integers. The length of the array must be at least 1.
        System.out.println("Task 1 - Difference: " + difference(numbers));

        //Task 2 - Write a Java method that finds the smallest and second smallest elements of a given array and prints them to the console.
        int[] smallestValues = twoSmallest(numbers);
        System.out.println("Task 2 - Smallest number: " + smallestValues[0] + " || Second smallest number: " + smallestValues[1]);

        //Task 3 - Write a Java method that calculates the result of the following mathematical expression, where x and y are two variables that have been pre-set in your code:
        int x = 15;
        int y = 20;
        System.out.println("Task 3 - Formula result: " + calculateFormula(x, y));

    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int number : array) {
            if (number < min) {
                min = number;
            }

        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int number : array) {
            if (number > max) {
                max = number;
            }

        }
        return max;
    }

    public static int difference(int[] array){
        return findMax(array) - findMin(array);
    }

    public static int[] twoSmallest(int[] array) {
        int smallest = findMin(array);
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : array) {
            if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        return new int[] {smallest, secondSmallest};
    }

    public static double calculateFormula(double x, double y){
        return (Math.pow(x, 2) + Math.pow(( ((4*y)/5) - x ), 2) );
    }
}