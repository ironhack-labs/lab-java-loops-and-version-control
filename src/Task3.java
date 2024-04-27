public class Task3 {
    //Formula is x²+((4y/5)-x)²
    public static void main(String[] args) {
        int x = 5;
        int y = 8;
        int s = x * x;
        double w = 4 * y;
        double g = w / 5;
        double a = g - x;
        double b = a * a;
        double result = s + b;

        System.out.println("The result of the expression is: " + result);
    }
}


/*
public class Task3 {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        double result = calculateExpression(x, y);
        System.out.println("The result of the expression is: " + result);
    }

    public static double calculateExpression(int x, int y) {
        double numerator = Math.pow(x + y, 2);
        double denominator = Math.sqrt(x * y);
        return numerator / denominator;
    }
}
*/

