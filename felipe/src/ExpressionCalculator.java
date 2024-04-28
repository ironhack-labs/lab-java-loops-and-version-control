public class ExpressionCalculator {

    public static double calculateExpression(double x, double y) {
        double result = Math.pow(x, 2) + Math.pow((4 * y / 5 - x), 2);
        return result;
    }

    public static void main(String[] args) {
        // Pre-set values for x and y
        double x = 3;
        double y = 2;

        // Calculate the expression result
        double expressionResult = calculateExpression(x, y);
        System.out.println("Result of the expression: " + expressionResult);
    }
}
