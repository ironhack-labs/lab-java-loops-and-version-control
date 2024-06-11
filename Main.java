import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Write a Java method that returns the difference between the largest and smallest values in an array of integers. The length of the array must be at least 1.

     int[] numArray = {4060,23533,31,400,5};

         int min = numArray[0];
         int max = numArray[0];


     for (int i = 0; i < numArray.length; i++){

         if(min > numArray[i]){
             min = numArray[i];
         }else if (max < numArray[i]){
             max = numArray[i];
         }
     }

     int difference = max - min;
        System.out.println("The Max number is: " + max + " and the lowest number is " + min + ". The difference is: " + difference +  ".");
    }
}