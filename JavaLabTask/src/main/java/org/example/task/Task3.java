package org.example.task;

public class Task3 {
    public void mathematicalExpression(int x,int y){
        int a = Math.multiplyExact(x,x);
        int b = ((4*y)/5)-x;
        int c = Math.multiplyExact(b,b);
        System.out.println(a+c);
    }
}
