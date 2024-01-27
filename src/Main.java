
import java.util.Arrays;

public class Main {
    public static void main (String[] args){

        int [] nb = {1, 100, 4, 25, 10};

        //TASK 1
        System.out.println("Task 1 - Maximum difference: " + maxDiff(nb));

        //TASK 2
        twoSmall(nb);


        //TASK 3
        int x = 4;
        int y = 5;
        calculateEquation(x, y);
    }

    public static int maxDiff(int []  nb) {

        Arrays.sort(nb);

        return (nb[nb.length - 1] - nb[0] );
    }

    public static void twoSmall(int [] nb) {

        Arrays.sort(nb);

        System.out.println("Task 2 - Minimum number: " + nb[0]);
        System.out.println("Task 2 - Second Minimum number: " + nb[1]);
    }

    public static void calculateEquation(int x, int y){

        double result = Math.pow(x, 2) + Math.pow(((double)(4 * y / 5) - x), 2);
        System.out.println("Task 3 - Result is: " + result);
    }
}