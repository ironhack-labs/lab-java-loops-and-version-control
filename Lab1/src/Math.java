public class Math {
    private static int x = 2; // Example value for x
    private static int y = 5; // Example value for y

    public static void main(String[] args) {
        // Calculate the result of the mathematical expression
        int result = calculateExpression(x, y);

        // Print the result
        System.out.println("Result of the expression for x = " + x + " and y = " + y + ": " + result);
    }

    // Method to calculate the mathematical expression
    public static int calculateExpression(int x, int y) {
        // Calculate the parts of the expression
        int part1 = Math.pow(x, 2); // x squared

        int part2 = (4 * y / 5) - x; // 4 times y divided by 5 minus x

        int part3 = Math.pow(part2, 2); // square of the above result

        // Calculate the final result
        int result = part1 + part3;

        return result;
    }

    private static int pow(int x, int y) {
        return x;
    }
}