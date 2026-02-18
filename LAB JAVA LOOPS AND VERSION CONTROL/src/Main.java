package src.java;
import java.lang.reflect.Array;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
        System.out.println("Hello World");
    }


//task 1
public static int difference(int[] arr){
    Arrays.sort(arr);
    return arr[arr.length-1] - arr[0];
}


//task 2
public static void smallest(int[] arr){
    Arrays.sort(arr);

    System.out.println(arr[0]);
    System.out.println(arr[1]);
}

//task3

public static int expression(int x, int y){
    return (int) (x*x + Math.pow((4*y/5)-x, 2));

}

}