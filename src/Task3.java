public class Task3 {
    public static double calculation() {
        double x = 10;
        double y = 8;
        double valueA = (double) Math.pow(x, 2);
        double valueB = (double) Math.pow(((4 * y) / 5) - x, 2);
        return valueA + valueB;
    }
    public static void main(String[] args) {
        System.out.println("My result is: " + calculation());
    }
}
