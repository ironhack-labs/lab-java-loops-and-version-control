package org.example;

public class task1 {
    public static int maxMinDifference(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int n : arr) {
            if (n < min) min = n;
            if (n > max) max = n;
        }
        return max - min;
    }


}
