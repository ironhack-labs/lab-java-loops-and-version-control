import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


//TASK NUMBER 1
        System.out.println("TASK 1 // My answer :");
        int[] numbers = { 107, 45, 78, 67, 5, 54, 130};
        System.out.println("Numbers not in order are: ");
        for (int number : numbers) System.out.print("[" + number + "]" + ",");
        System.out.println("        ");
        System.out.println("My numbers in order are:");
        Arrays.sort(numbers);
        String result = Arrays.toString(numbers);
        System.out.println(result);
        System.out.println("The smallest number is: " + numbers[0]);
        System.out.println("The biggest number is: " + numbers[6]);
        System.out.print("The difference between them is: ");
        System.out.println(numbers[6]-numbers[0]);
// TASK NUMBER 2
        System.out.println("TASK 2 // My answer :");
        System.out.println("My numbers for this task are: ");
        int[] numbersforsecondtask = new int[]{10, 35, 65, 67, 90, 300};
        Arrays.sort(numbersforsecondtask);
        result = Arrays.toString(numbersforsecondtask);
        System.out.println(result);
        System.out.println("The smallest number is: " + numbersforsecondtask[0]);
        System.out.println("The second smallest number is: " + numbersforsecondtask[1]);
// TASK NUMBER 3
        System.out.println("TASK 3 // My answer :");
        System.out.println("The numbers I am taking are: " );
        int x = 7;
        int y = 14;
        System.out.print("X is: " + x);
        System.out.println("   Y is: " + y);
        int solveda = x * x;
        int solvedb = ((4 * y) / 5 - x) * ((4 * y) / 5 - x);

        int resultsofAandB = solveda - solvedb;
        System.out.println("My result of the math expression is:  " + resultsofAandB);




    }
}