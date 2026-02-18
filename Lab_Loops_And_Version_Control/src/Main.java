import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================");
        int[] numbersForDiff = {1, 2, 3, 4, 5, 6};
        int result = diffMaxMin(numbersForDiff);
        System.out.println("Difference: " + result);
        System.out.println("==================================");

        int[] numbersForSmallest = {1,23,4,5,6,7,1};
        findSmallestAndSecondSmallest(numbersForSmallest);
        System.out.println("==================================");

        calculateExpression(2,3);
        System.out.println("==================================");

    }

    public static int diffMaxMin(int[] numbers) {

        if (numbers == null || numbers.length < 1) {
            throw new IllegalArgumentException("Array must contain at least one element.");
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return max - min;
    }

    public static void findSmallestAndSecondSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int smallest, secondSmallest;

        if (arr[0] < arr[1]) {
            smallest = arr[0];
            secondSmallest = arr[1];
        } else {
            smallest = arr[1];
            secondSmallest = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            int num = arr[i];

            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        if (smallest == secondSmallest) {
            System.out.println("There is no second smallest element (all elements may be equal).");
        } else {
            System.out.println("Smallest: " + smallest);
            System.out.println("Second Smallest: " + secondSmallest);
        }
    }

    public static void calculateExpression(int x, int y){
        System.out.println("Result after calculation : " + ((x*x) + (((4*y/5) - x) * (4*y/5) - x)));
    }
}
