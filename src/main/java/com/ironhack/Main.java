package main.java.com.ironhack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Exercise1
        int[] numbers = {1212, 23, 98, 64, 323, 78, 21};
        System.out.println("Difference between the largest and smallest: " + differenceBetweenMaxMin(numbers));

        //Exercise2
        firstSecondSmallest(numbers);

        //Exercise3
        System.out.println("Result: " + calculateExpression(2, 5));


    }

    //Exercise1
    public static int differenceBetweenMaxMin(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }

        }
        return max - min;


    }

    //Exercise2
    public static void firstSecondSmallest(int[] array) {
        int min = array[0];
        int min2 = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min2 = min;
                min = array[i];

            } else if (array[i] < min2 && min != array[i]) {
                min2 = array[i];
            }
        }
        System.out.println("First smallest element is: " + min);
        System.out.println("Second smallest element is: "+ min2);


    }

    //Exercise3
    public static double calculateExpression(double x, double y) {
        double result = Math.pow(x, 2) + Math.pow(4 * y / 5 - x, 2);
        return result;
    }
}