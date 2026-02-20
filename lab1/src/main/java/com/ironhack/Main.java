package com.ironhack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int nums = 0;
        int result = nums;
        int[] myArray = {2,3,7,9};
        int min = myArray[0];
        int max = myArray[0];
        int i;

        for (i = 0; i < myArray.length;i++) {
            if (myArray[i] < min) {
                min = myArray[i];
            }
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        System.out.println("minimumu " + min);
        System.out.println("maximumu " + max);
        int difference = max - min;
        System.out.println("Differenceleri " + difference);

        /*TASK 2
Write a Java method that finds the smallest and second smallest elements of a
given array and prints them to the console.
*/
        int [] array2 = {2,3,7,1,9};

        int smallest = array2[0];
        for (int k=0; k<array2.length;k++){
            if (array2[k]<smallest){
                smallest = array2[k];
            }
        }
        int secondSmallest = array2[0];
        for (int z=0;z<array2.length;z++){
            if (array2[z]<secondSmallest && array2[z]!= smallest){
                secondSmallest = array2[z];
            }
        }
        System.out.println("smallest: " + smallest);
        System.out.println("secondSmallest " + secondSmallest);



        /*TASK 3
Write a Java method that calculates the result of the following mathematical expression,
where x and y are two variables that have been pre-set in your code:
x*x + ((4*y)/5 - x)*((4*y)/5 - x)
*/
        int x;
        int y;
        //for example
        x=5;
        y=2;
        int resultOfCalc = (x*y)+ ((4*y)/5 - x)*((4*y)/5 - x);
         System.out.println("Result for calculation is " + resultOfCalc);
    }
}