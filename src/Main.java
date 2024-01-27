import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] test1 = {5, 8 , 9 , 1};
        int[] test2 = {6, 6};
        int[] test3 = {6};

        // Test Task1
        System.out.println(range(test1));
        System.out.println(range(test2));
        System.out.println(range(test3));

        // Test Task2
        printSmallestTwo(test1);
        printSmallestTwo(test2);
        printSmallestTwo(test3);

        // Test Task 3
        System.out.println(calculate(5, 5));
        System.out.println(calculate(1, -1));
        System.out.println(calculate(1.5, -1));

    }

    //Task 1 - returns the difference between the largest and smallest values in an array of integers
    private static int range(int[] intArr) {
        // The length of the array must be at least 1, so initial values are the first number of the array
        int max = intArr[0];
        int min = intArr[0];

        // Iterate through array to find the real max and min of the array
        for (int number: intArr) {
            if (number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }
        }

        // Return the range of the array
        return max - min;
    }

    // Task2 - finds the smallest and second smaller elements of a given array and prints them to the console
    private static void printSmallestTwo(int[] intArr) {
        // Input validation requires intArray to have at least 2 numbers
        if (intArr.length < 2) {
            System.out.println("Array has to have minimum 2 integers");
            return ;
        }

        // Sort the array to isolate the smallest two numbers in the first two positions of intArr
        Arrays.sort(intArr);

        // Print two smaller numbers in intArr
        System.out.println(intArr[0]);
        System.out.println(intArr[1]);
    }

    // Task 3
    private static double calculate(double x, double y) {
        // Separate left and right side of the mathematical expression from the '+'
        double lhs = Math.pow(x, 2);
        double auxRhs = (4 * y / 5) - x;
        double rhs = Math.pow(auxRhs, 2);


        return lhs + rhs;
    }
}
