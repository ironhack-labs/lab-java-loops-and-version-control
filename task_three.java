public class task_three {
    public static double calculateExpression(double x, double y) {
        double result = Math.pow(x, 2) + Math.pow((4 * y / 5 - x), 2);
        return result;
    }

    public static void main(String[] args) {
        double x = 3.0;
        double y = 2.0;

        double expressionResult = calculateExpression(x, y);
        System.out.println("Result of the expression: " + expressionResult);
    }
}
