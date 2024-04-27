import java.util.Arrays;

import static java.lang.Double.MAX_VALUE;

public class Task2 {
    public static void main(String[] args) {

        //Write a Java method that finds the smallest and second smallest elements of a given array and prints them to the console.

        double [] element = {1.4, 0.3, 2.5, 0.2, 0.4, 0.01, 0.02 };


        System.out.println(Arrays.toString(element));

        //Find the smallest and the second smallest number on the array above.
        //start from "0" so the code checks the array from the first item on the list (2.3)

        double smallest = MAX_VALUE;
        double secondSmallest = MAX_VALUE;

        //Now, I have to figure out the way of telling the code to check for the smallest an second smallest.

        for (int i = 0; i < element.length; i++) {
            if (element[i] < smallest) {
                smallest = element[i];

            } else if (element[i] < secondSmallest && element[i] != smallest) {
                secondSmallest = element[i];



            }

            }


            System.out.println(" Smallest number in Array " + smallest );
            System.out.println(" Second smallest number in Array " + secondSmallest);
        }

}













