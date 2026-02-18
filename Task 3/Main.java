public class Main {

    public static double calculateExpression(double x, double y) {
        return x*x + ((4 * y / 5.0) - x)*((4 * y / 5.0) - x);
    }
    public static void main(String[] args) {
        double x = 4; 
        double y = 5; 

        double result = calculateExpression(x, y);
        System.out.println("Result: " + result);
    }
}
