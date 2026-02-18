package org.example.task;

public class Task2 {
    public String smallestAndSecond(int[] arr){
        if (arr == null || arr.length < 2) {
            return "Array must contain at least two elements.";
        }

        int min;
        int secondMin;

        if (arr[0] < arr[1]) {
            min = arr[0];
            secondMin = arr[1];
        } else {
            min = arr[1];
            secondMin = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            }
            else if(arr[i] < secondMin && arr[i] != min){
                secondMin = arr[i];
            }
        }
        if (min == secondMin) {
            return "No second smallest element found.";
        }

        return "smallest: " + min +
                "\nsecond: " + secondMin;
    }
}
