package src;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int []  numbers  = {1, 2, 5, -1};
        System.out.println("\n");
        System.out.println("This is the LAB for week 1");
        System.out.println("Emmanuel Barboza");
        System.out.println("\n");
        System.out.println("I made an array of length "+ numbers.length +":");
        System.out.println(Arrays.toString(numbers));

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }

        System.out.println("The maximum value of the array is:");
        System.out.println(max);

        int min = numbers[0];
        int secondMin = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            } else if (numbers[i] < secondMin) {
                secondMin = numbers[i];
            }
        }

        int diff = max - min;

        System.out.println("\n");
        System.out.println("Task 1:");
        System.out.println("The difference between the largest and the smallest");
        System.out.println("value in the array is:");
        System.out.println(diff);
        System.out.println("\n");
        System.out.println("Task 2:");
        System.out.println("The minimum value of the array is:");
        System.out.println(min);
        System.out.println("The second minimum value of the array is:");
        System.out.println(secondMin);
        System.out.println("\n");
        System.out.println("Task 3 is in the attached class ->");


    }




    }