import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        //Write a Java method that returns the difference between the largest and smallest values in an array of integers. The length of the array must be at least 1

        //Step 1 - choose an array of number: using int (interage) plus [] as it is an array.

        int[] numbers = {10, 2, 3, 4, 9, 6, 12, 8, 20};

        // print Array to string inorder to print out number instead of a symbol.

        System.out.println(Arrays.toString(numbers));

        //Now, I need to choose the smallest number and the largest number.

        int maxvalue = numbers[0];
        int minvalue = numbers[0];

        //Loop to find them both on the int above.

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxvalue) {
                maxvalue = numbers[i];
            }
            else if (numbers [i] < minvalue) {
                minvalue = numbers[i];
            }



            }

        //Difference between largest and smallest value.

        System.out.println("The difference between the largest an smallest value is " + (maxvalue - minvalue));









    }
}