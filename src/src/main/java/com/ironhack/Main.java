package com.ironhack;

public class Main {
    public static void main(String[] args) {
        System.out.println(method(2,5));
        int[] arr = {1,1,3,4,5};
        findTwoSmallest(arr);
    }

    public static int arrayRange(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("The length of the array must be at least 1");
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        return max - min;
    }

    public static void findTwoSmallest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("The length of the array must be at least 1");
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Second Smallest: " + secondSmallest);
    }

    public static int method(int x, int y){
        return (x*x) + (((4*y/5) - x) * ((4*y/5) - x));
    }
}