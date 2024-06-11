package com.ironhack.lab;


public class Main {

    // Method to calculate the difference between the largest and smallest values in an array
    public int maxMinDifference(int[] numbers) {
        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        return max - min;
    }

    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] myNumbers = {10, 20, 30, 40, 50};

        // Create an instance of the Main class
        Main example = new Main();

        // Call the maxMinDifference method and pass the array
        int difference = example.maxMinDifference(myNumbers);

        // Print the difference
        System.out.println("The difference between the largest and smallest values is: " + difference);
    }
}
