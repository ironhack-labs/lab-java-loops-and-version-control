package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main() {
        int[] arr = {4, 12, 54, 36, 325, 673, 43, 7, 8};
        System.out.println(calculate(2,4));
        System.out.println(minMaxDifference(arr));
        minAndSecondMin(arr);
    }
    public static int minMaxDifference(int[] array){
        int min=array[0];
        int max=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return max-min;
    }

    public static void minAndSecondMin(int[] array){
        int min=array[0];
        int secondMin=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        if(secondMin==min){
            secondMin=array[1];
        }
        for(int i=0;i<array.length;i++){
            if(array[i]==min){
              continue;
            }
            if(array[i]<secondMin){
                secondMin=array[i];
            }
        }
    System.out.println("First minimum: "+min+"||| Second min: "+secondMin);
    }

    public static double calculate(double x, double y){
        double result = Math.pow(x,2)+Math.pow(((4*y)/5)-x,2);
        return result;
    }
}
