public class Task3 {
    public static void main(String[] args) {
        double x = 2;
        double y = 4;
        //
        calculateFunction(x, y);
    }

    public static void calculateFunction(double x, double y) {
        double solution = Math.pow(x, 2) + Math.pow(((4 * y / 5) - x), 2);
        System.out.println(solution);
    }
}
