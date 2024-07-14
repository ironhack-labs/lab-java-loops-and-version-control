public class MathUtils {

public static double calculateExpression(double x, double y) {
    if (x == y) {
        throw new ArithmeticException("Division by zero is not allowed");
    }

    return (x + y) / (x - y);
}

public static void main(String[] args) {
    double x = 5.0;
    double y = 3.0;
    System.out.println("Result: " + calculateExpression(x, y)); // Output: 4.0
}
}


