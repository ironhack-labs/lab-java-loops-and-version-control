package org.example;

public class Task3 {
    public static void main(String[] args) {
        int x = 5;
        int y = 5;
        calculate(x,y);
    }
    public static void calculate(int x, int y){
        double result = Math.pow(x,2) + Math.pow(((4*y*0.2)-x),2);
        System.out.println(result);
    }
}
