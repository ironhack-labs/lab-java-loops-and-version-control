package com.ironhack.lab;

public class Math {

    // Method to find the smallest and second smallest elements in an array
    public static void findSmallestElements(int[] numbers) {
        if (numbers.length < 2) {
            throw new IllegalArgumentException("Array length must be at least 2");
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < smallest) {
                secondSmallest = smallest;
                smallest = number;
            } else if (number < secondSmallest && number != smallest) {
                secondSmallest = number;
            }
        }

        System.out.println("Task 2: Smallest element is: " + smallest);
        System.out.println("Task 2: Second smallest element is: " + secondSmallest);
    }

    public static void main(String[] args) {
        // Example array
        int[] myNumbers = {10, 5, 20, 3, 30, 8};

        // Call the findSmallestElements method
        findSmallestElements(myNumbers);
    }
}

