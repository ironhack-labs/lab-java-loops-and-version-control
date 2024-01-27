import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] arrayNumbers = {4,1,3,20};
        valueDifference(arrayNumbers);
        twoSmallestInt(arrayNumbers);
        mathResult(3,6);

    }


    public static int valueDifference(int[] arrNumbers){
        int largestValue;
        int smallestValue;
        int difference;

        if(arrNumbers.length > 1) {
            largestValue = arrNumbers[0];
            smallestValue = arrNumbers[0];

            for (int i = 1; i < arrNumbers.length; i++) {

                //Obtain smallest number
                if (arrNumbers[i] < smallestValue ){
                    smallestValue = arrNumbers[i];
                }

                //Obtain largest number
                if(arrNumbers[i] >  largestValue){
                    largestValue = arrNumbers[i];
                }
            }

            difference = largestValue - smallestValue;
            return difference;
        }else {
            throw new Error("The array has less than two values");
        }

    }

    public static void twoSmallestInt(int [] arrNumbers){
        if(arrNumbers.length>1) {

            //Algorithm to sort the array in ascending order
            for (int i = 0; i < arrNumbers.length-1; i++) {
               for(int j = i+1; j< arrNumbers.length; j++){
                   if(arrNumbers[i] > arrNumbers[j]){
                       int temporalValue = arrNumbers[i];
                       arrNumbers[i] = arrNumbers[j];
                       arrNumbers[j] = temporalValue;
                   }
               }
            }
            System.out.println(arrNumbers[0]);
            System.out.println(arrNumbers[1]);
        }else{
            throw new Error("The array has less than two values");
        }

    }

    public static double mathResult(int x,int y){

        float multiplicationValue = 4*y;
        float divisionValue = multiplicationValue/5;

        return Math.pow(x,2) + Math.pow(divisionValue - x,2);
    }
}
