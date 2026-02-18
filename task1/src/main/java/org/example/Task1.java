package org.example;

public class Task1 {
    public static void main(String[] args) {
        int[] nums = {3,5,7,2,8};
        int value = differenceMinAndMax(nums);
        System.out.println(value);
    }
    public static int differenceMinAndMax(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for (int x : arr) {
            if(x > max) max = x;
            if(x < min) min = x;
        }
        return max-min;
    }
}
