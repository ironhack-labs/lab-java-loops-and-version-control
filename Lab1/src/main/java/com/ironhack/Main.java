package com.ironhack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        int[] nums={1,45,23,12};

        getDiffer(nums);
        System.out.println(" ");
        smallItems(nums);
        System.out.println(" ");
        mathMaster(2,5);
    }

    public static void mathMaster(int x,int y){
        int result=(x*x)+(((4*y)/5)-x)*(((4*y)/5)-x);
        System.out.println("Result="+result);
    }


    public static void smallItems(int[] array) {
        int min = array[0];

        int secMin=array[1];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] < secMin && array[i] != min) {
                secMin = array[i];
            }
        }

        System.out.println("Smallest="+min);
        System.out.println("Second smallest="+secMin);
    }



    public static void getDiffer(int[] array){

        int max=array[0];
        int min=array[0];

        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
            else if (array[i]<min) {
                min=array[i];
            }
        }

        System.out.println("Max="+max+"\n"+"Min="+min);
        System.out.println("Difference of max and min values="+(max-min));
    }
}
