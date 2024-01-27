package exercises.exercises;

import java.util.Arrays;
import java.util.Random;

public class exercises {
    public static void main(String[] arg){
        ex1();
        ex2();
        System.out.println(ex3(2,1));
    }

    public static void ex1() {

        // Create random list
        Random rand = new Random();

        int upperbound = 25;
        int length = 5;
        int[] ls = new int[5];

        for (int i = 0; i < length; i++) {
            ls[i] = rand.nextInt(upperbound);
        }

        // Sort array
        Arrays.sort(ls);

        System.out.println(ls[ls.length -1] - ls[0]);
    }

    public static void ex2() {

        // Create random list
        Random rand = new Random();

        int upperbound = 25;
        int length = 5;
        int[] ls = new int[5];

        for (int i = 0; i < length; i++) {
            ls[i] = rand.nextInt(upperbound);
        }

        // Sort array
        Arrays.sort(ls);

        System.out.println(Arrays.toString(ls));
        System.out.println("lowest: " + ls[0] );
        System.out.println("second lowest: " + ls[1]);
    }

    public static double ex3(double x, double y) {

        //double result =  Math.pow(x, 2) + Math.pow(((4 * y / 5) - x), 2);
        double fact1 = Math.pow(x, 2);
        double fact2 = Math.pow(((4 * y / 5) - x), 2);
        return fact1 + fact2;
    }
}
