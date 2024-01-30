public class MathExpressionCalculator {

    public static double calculateExpression(int x, int y) {
        return Math.pow(x, 2) + ((4.0 * y / 5) - x);
    }

    public static void main(String[] args) {
        // Pre-set values for x and y
        int x = 3; // Example value for x
        int y = 5; // Example value for y

        // Calculate the result of the mathematical expression
        double result = calculateExpression(x, y);

        // Print the result
        System.out.println("Result: " + result);
    }
}
