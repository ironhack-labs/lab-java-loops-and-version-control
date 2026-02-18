package org.example.task;

public class Task1 {
    public String difference(int[] arr){
        if (arr.length<1){
            return "The length of the array must be at least 1";
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return String.valueOf(max-min);
    }
}
