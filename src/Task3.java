//Task 3
//Write a Java method that calculates the result of the following mathematical expression, where x and y are two variables
// that have been pre-set in your code:

public class Task3 {
    static double calculation(double x, double y) {
        return x * x + ((4 * y) / 5 - x) * ((4 * y) / 5 - x);
    }

    public static void main(String[] args) {
        double x = 3;
        double y = 8;
        double result = calculation(x, y);
        System.out.println(result);
    }
}