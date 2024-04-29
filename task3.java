public class task3 {
    public static void main(String[] args) {
        // Assume x and y are pre-set variables
        double x = 5.0; // Example value for x
        double y = 8.0; // Example value for y

        double term1 = Math.pow(x, 2);
        double term2 = Math.pow((4 * y / 5) - x, 2);
        double result = term1 + term2;

        System.out.println("Result of the expression: " + result);
    }
}
