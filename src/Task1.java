package src;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args)  {


        int[] arrayNumbers = {3, 8, 5, 2, 7};
        System.out.println("Array: " + Arrays.toString((arrayNumbers)));

        int bValue = arrayNumbers[0];
        int sValue = arrayNumbers[0];

        for (int i = 1; i < arrayNumbers.length; i++)

            if (arrayNumbers[i] > bValue) {

                bValue = arrayNumbers[i];
                System.out.println("Difference is : " + (bValue - sValue));

            } else if (arrayNumbers[i] < sValue)
                sValue = arrayNumbers[i];


    }
    }
