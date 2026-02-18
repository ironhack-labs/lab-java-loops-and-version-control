package com.ironhack;

public class SecondMin {
    public static int secondMin(int [] array) {
        int min = array[0];
        int secondMin = array[1];

        for (int i = 0 ; i < array.length ; i++){
            if(array[i] < min){
                min = array[i];
                secondMin = min;
                System.out.println("if");

            }

            else if(array[i] < secondMin && array[i] != min){
                secondMin = array[i];
                System.out.println("else");
            }
        }
        return secondMin;
    }
}
