import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

            int[] numberArray = {3, 6, 5, 7, 9};

            int min = numberArray[0];
            int max = numberArray[0];

            for (int i = 0; i < numberArray.length; i++) {
                if (min > numberArray[i]) {
                    min = numberArray[i];
                } else if (max < numberArray[i]) {
                    max = numberArray[i];
                }

            }

            int difference = max - min;
            System.out.println(difference);

            //Second Task
            int[] smallestArray = {3,9,5,6,1,4};
            findSmallest(smallestArray);

            double xValue = 4.0;
            double yValue = 2.0;
            double finalResult = evaluateExpression(xValue, yValue);
            System.out.println("Result: " + finalResult);

    }

    public static void findSmallest(int[] numbers) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int number : numbers) {
            if(number < smallest){
                secondSmallest = smallest;
                smallest = number;
            } else if ( number < secondSmallest && number != smallest) {
                secondSmallest=number;

            }
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Second Smallest Number:" + secondSmallest);
    }

    public static double evaluateExpression(double x, double y) {
        return Math.pow(x, 2) + Math.pow((4 * y / 5 - x), 2);
    }
}
