import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Task TWO Write a Java method that returns the difference between the largest and smallest values in an array of integers. The length of the array must be at least 1.

        int[] numArray = {4060, 23533, 31, 461, 5};

        int min = numArray[0];
        int max = numArray[0];


        for (int i = 0; i < numArray.length; i++) {

            if (min > numArray[i]) {
                min = numArray[i];
            } else if (max < numArray[i]) {
                max = numArray[i];
            }
        }

        int difference = max - min;
        System.out.println("The Max number is: " + max + " and the lowest number is " + min + ". The difference is: " + difference + ".");


        // Task TWO Write a Java method that finds the smallest and second smallest elements of a given array and prints them to the console.

        int smallest = numArray[0];
        int secondSmallest = numArray[0];

        for (int i = 0; i < numArray.length; i++) {
            if (smallest > numArray[i]) {
                smallest = numArray[i];
            }
        }
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] < secondSmallest && numArray[i] != smallest) {
                secondSmallest = numArray[i];
            }
        }

        System.out.println(smallest);
        System.out.println(secondSmallest);


        //Third Task Write a Java method that calculates the result of the following mathematical expression, where x and y are two variables that have been pre-set in your code:
        // x squared PLUS PARENTHESES 4y div 5 minus x END PARENTHESES squared

        //This was my attempt; My code works, but when I checked with AI I was advised to make it more legible

      double x = 2;
      double y = 2;
      double result = calculate(x,y);
//      double xSquared = Math.pow(x,2);
//      double parenthesisPortion = 4 * y / 5 - x;
//      double parenthesisSquared = Math.pow(parenthesisPortion, 2);

//        System.out.println(xSquared + parenthesisSquared);


      System.out.println(result);

    }
    public static double calculate(double x, double y){

        return Math.pow(x, 2) + Math.pow(((4*y)/5) - x, 2);

//        double xSquared = Math.pow(x,2);
//        double parenthesisPortion = 4 * y / 5 - x;
//        double parenthesisSquared = Math.pow(parenthesisPortion, 2);

//        return xSquared + parenthesisSquared;


    }
}