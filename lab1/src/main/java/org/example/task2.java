package org.example;

public class task2 {
    public static int[] finder(int[] args) {
        int min = args[0];
        for (int n : args) {
            if (n < min) min = n;
        }
        int secondMin = args[0];
        for (int n : args) {
            if (n > min) {
                secondMin = n;
                break;
            }
        }
        for (int n : args) {
            if (n > min && n < secondMin) {
                secondMin = n;
            }
        }

        return new int[]{min, secondMin};
    }




}
