package az.tanz;


import static az.tanz.Task3.mathfunc;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        int x =71;
        int y=3;
        int[] arr= {12,23,321};
        int task1result = Task1.diffinArrayRange(arr);
        double task3result =mathfunc(x,y);

        System.out.println(task1result);
        Task2.firAndSecSmal(arr);
        System.out.println(task3result);


    }
}
