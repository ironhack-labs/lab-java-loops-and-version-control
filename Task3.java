public class Task3 {
    static int x = 2;
    static int y = 2;

    public static void main(String[] args) {
        int result = calculateExpression(x, y);

        System.out.println("The result is: " + result);
    }
    static int calculateExpression(int x, int y) {
        int result = x * 2 + (4 * y / 5 - x)* 2;
        return result;
    }


}
