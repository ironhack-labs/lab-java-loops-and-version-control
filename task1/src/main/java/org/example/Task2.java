package org.example;

public class Task2 {
    public static void main(String[] args) {
        int[] nums = {3,5,7,2,8};

        MinAndSecondMin(nums);
    }
    public static void MinAndSecondMin(int[] arr){
        int min = arr[0];
        int min2 = arr[0];
        for (int x : arr) {
            if (x< min) {
                min2 =min;
                min = x;
            }
            if(x > min && x < min2) min2 = x;
        }
        System.out.println("min1: " + min +"\n min2: " + min2);
    }
}
