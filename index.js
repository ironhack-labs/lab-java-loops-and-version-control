import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        while (continueLoop) {
            System.out.println("pls select the task you want to lunch 1--task1 , 2--task2 , 3--task3 or q to quit. ");
            String selectedTask = scanner.next();
            switch (selectedTask) {
                case "1":
                    System.out.println("executing task1");
                    task1();
                break;
                case "2":
                    System.out.println("executing task2");
                    task2();
                    break;

                case "3":
                    System.out.println("executing task3");
                    double x = 5.0;
                    double y = 3.0;
                    double sum = xyExpression(x, y);
                    System.out.println("The result is: " + sum);
                    break;
                case "q":
                case "Q":
                    System.out.println("quitting...");
                    continueLoop = false;
                    break;
                default:
                    System.out.println("Invalid selection. Please enter 1, 2, 3, or q to quit.");
                    break;
            }
        }
    scanner.close();
    }

public static void task1() {
        int[] arrayNumbers = {  7, 12, -4,  5,  6, 14,  8};
        int largestNumber =arrayNumbers[0];
        int smallestNumber =arrayNumbers[0];


        for (int i = 1; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] > largestNumber) {
                largestNumber = arrayNumbers[i];
                ;
            }
            if (arrayNumbers[i] < smallestNumber) {
                smallestNumber = arrayNumbers[i];

            }
        }

        System.out.println("largest Number: " + largestNumber);
        System.out.println("smallest Number is: " + smallestNumber);

        double difference = largestNumber - smallestNumber ;
        System.out.println("the difference is " + difference);


}

public static void task2() {

        int[] arrayNumbers = {  7, 12, -4,  5,  6, 14,  8};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest  =Integer.MAX_VALUE;


        for (int number : arrayNumbers  ) {
            if (number  < smallest ) {
                secondSmallest  = smallest ;
                smallest = number ;
            } else if (number < secondSmallest && number != smallest ){
                secondSmallest = number;
            }

        }
        System.out.println("smalest value " + smallest) ;
        System.out.println(" second smallest value  " + secondSmallest);


    }

//    Task3 
    public static double xyExpression (double x, double y) {
        
        double xExpression = Math.pow(x, 2);

        
        double yExpression = (4.0 * y / 5.0) - x;

       
        double xSquared = Math.pow(yExpression, 2);

        
        double result = xExpression + xSquared;

        return result;



    }

}