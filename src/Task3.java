package src;

public class Task3 {
    public static void main(String[] args) {

        taskThree();


    }
    public static double taskThree() {

        int x= 2;
        int y= -3;

        double calc;
        calc = Math.pow(x , 2) + Math.pow(((double) (4 * y) / 5) - x, 2);
        System.out.println("\n");
        System.out.println("Task 3:");
        System.out.println("The result of the mathematical expression x² + (4y/5 - x)² is: ");
        System.out.println(calc);

        return calc;



    }
}
