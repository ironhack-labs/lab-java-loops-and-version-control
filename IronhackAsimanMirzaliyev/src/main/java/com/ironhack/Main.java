package com.ironhack;

import java.util.Scanner;

import static com.ironhack.Difference.findDifference;
import static com.ironhack.SecondMin.secondMin;
import static com.ironhack.findValue.findTotal;



public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Include size of array ");
        int n = scanner.nextInt();
        int [] array = new int[n];
        System.out.println("Include x and y");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Include elements of array ");
        for(int i = 0 ; i < n ; i++ ){
            array[i]= scanner.nextInt();
        }
        int difference = findDifference(array);
        System.out.println(difference);
        int secondMinNumber = secondMin(array);
        System.out.println("Second minimum is : " + secondMinNumber);
        int total = findTotal(4,5);
        System.out.println(total);
        }




}
