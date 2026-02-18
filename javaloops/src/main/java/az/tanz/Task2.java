package az.tanz;

import java.util.Arrays;

public class Task2 {
    public static void firAndSecSmal(int[] arr){
        final int ARR_LEN=arr.length;

        if (ARR_LEN==0){

            System.out.println("====================================");
            System.out.println("ARR_LEN should be more than 0!!");
            System.out.println("====================================");

            return;
        }

        Arrays.sort(arr);

        System.out.println("Min one: "+arr[0]+" Second min one: "+arr[1]);

    }
}
