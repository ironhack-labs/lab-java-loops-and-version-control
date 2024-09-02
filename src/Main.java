public class Main {

    // Task 1
    public static int findDifference(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        return max - min;
    }

    // Task 2
    public static void findSmallestAndSecondSmallest(int[] array) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : array) {
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2 && num != min1) {
                min2 = num;
            }
        }

        System.out.println("Smallest element: " + min1);
        System.out.println("Second smallest element: " + min2);
    }

    // Task 3
    public static double calculateExpression(double x, double y) {
        return (x * x) + (2 * x * y) + (y * y);
    }

    public static void main(String[] args) {
        // Example usage for Task 1
        int[] array1 = {3, 7, 1, 9, 2};
        System.out.println("Difference: " + findDifference(array1));

        // Example usage for Task 2
        int[] array2 = {5, 8, 2, 4, 1, 7};
        findSmallestAndSecondSmallest(array2);

        // Example usage for Task 3
        double x = 3.0;
        double y = 4.0;
        System.out.println("Result of expression: " + calculateExpression(x, y));
    }
}




