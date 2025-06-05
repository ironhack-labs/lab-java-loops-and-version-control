//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        int[] numbers = {10, 5, 8, 3, 12};

        findDifference(numbers);
        findSmallest(numbers);

        double x = 2; // Pre-set value for x
        double y = 3; // Pre-set value for y

        double result = calculateExpression(x, y);
        System.out.println("Result: " + result);

    }

    // Task 1

    public static void findDifference(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int difference = max - min;
        System.out.println("Difference: " + difference);
    }


    // Task 2

    public static void findSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        System.out.println("Smallest element: " + smallest);
        System.out.println("Second smallest element: " + secondSmallest);
    }

    // Task 3

    public static double calculateExpression(double x, double y) {
        double term1 = Math.pow(x, 2);
        double term2 = Math.pow((4 * y / 5 - x), 2);

        return term1 + term2;
    }
}


