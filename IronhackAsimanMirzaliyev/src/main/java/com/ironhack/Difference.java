package com.ironhack;

public class Difference {
    public static int findDifference(int [] array){
        int max = array[0];
        int min = array[0];
        if (array.length != 0) {
            for(int i =0; i<array.length;i++) {
                if(array[i]>max){
                    max = array[i];
                }

            }
        }

        for(int i =0; i<array.length;i++) {
            if(array[i]<min){
                min = array[i];
            }

        }

        return max-min;
    }
}
