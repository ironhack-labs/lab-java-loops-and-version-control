package org.example;
import org.example.task.Task1;
import org.example.task.Task2;
import org.example.task.Task3;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Task1 task = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        int[] arr = {1,2,3,4,5,6};
//        System.out.println(task2.smallestAndSecond(arr));
        task3.mathematicalExpression(2,5);
    }
}