import java.util.Arrays;

public class DifferenceLargestSmallestInt {

    //Exercise 1

    //Write a Java method that returns the difference between the largest and smallest values in an array of integers. The length of the array must be at least 1.

    public static void print() {

        //importing sort method to sort the array

        int[] numbers = {89,932,3,300,600,7,400};

        //call sort method on array

        Arrays.sort(numbers);

        // get first and last array location store them in a new

        int substractedValue = numbers[numbers.length - 1] - numbers[0];

        System.out.println("The value is: " + numbers[0] + " minus " + numbers[numbers.length -1] + " Outcome is : " + substractedValue + " is the difference");

    }
}
