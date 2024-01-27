import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Task one, find the difference between the largest and the smallest number:
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(difference(numbers));

        //Task 2 find the 2 first smallest numbers in a int[]
        smallestAndSecond(numbers);

        //Task 3 calculate formula
        int x = 1;
        int y = 2;
        System.out.println(calculateFormula(x, y));

    }

    public static int findMin(int[] myArray) {
        int min = myArray[0];
        for (int num : myArray) {
            if (num < min) {
                min = num;
            }

        }
        return min;
    }

    public static int findMax(int[] myArray) {
        int max = myArray[0];
        for (int num : myArray) {
            if (num > max) {
                max = num;
            }

        }
        return max;
    }

    public static int difference(int[] myArray){
        return findMax(myArray) - findMin(myArray);
    }

    public static void smallestAndSecond(int[] myArray) {

        int smallest = findMin(myArray);
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : myArray) {
            if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        System.out.println(smallest);
        System.out.println(secondSmallest);

    }

    public static double calculateFormula(double x, double y){
        return (Math.pow(x, 2) + Math.pow(( (4*y/5) - x ), 2) );
    }

}
