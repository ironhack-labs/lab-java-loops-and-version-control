package MyJavaProject.src.main.java.com.yourpackage;

public class MathExpression {

    // Method to calculate the result of the given mathematical expression
    public static double calculateExpression(double x, double y) {
        double term1 = Math.pow(x, 2); // x^2
        double term2 = Math.pow((4 * y / 5 - x), 2); // (4*y/5 - x)^2
        return term1 + term2;
    }

    // Main method to test the calculateExpression method
    public static void main(String[] args) {
        double x = 3; // Pre-set value for x
        double y = 4; // Pre-set value for y

        double result = calculateExpression(x, y);
        System.out.println("The result of the expression is: " + result);
    }
}
