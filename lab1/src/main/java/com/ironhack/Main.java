package com.ironhack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] myArray = {23, 34, 44, 120, 24};

        //Testing Task 1
        System.out.println(minMaxDifference(myArray));

        //Testing Task 2
        twoSmallests(myArray);

        //testing Teak 3
        System.out.print("The result of the calculation according to the formula: " + calculateFormula(4, 10));
    }

    //Task 1
    public static int minMaxDifference(int[] array){
        int min = array[0];
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
            if(max < array[i]){
                max = array[i];
            }
        }
        int result = max - min;
        return result;
    }

    //Task 2
    public static void twoSmallests(int[] array){
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i++){
            if(min > array[i]){
                secondMin = min;
                min = array[i];
            }
            else if(secondMin > array[i] && array[i] != min){
                secondMin = array[i];
            }
        }
        System.out.println("Smallest number: " + min);
        System.out.println("Second Smallest number: " + secondMin);
    }

    //Task 3
    public static double calculateFormula(double x, double y){
        double result = Math.pow(x, 2) + Math.pow((((4 * y) / 5) - x), 2);
        return result;
    }
}