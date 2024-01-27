public class Task2 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        int term1 = x * x;
        int term2 = ((y * 4) / 5 - x);
        int term3 = term2 * term2;

        int result = term1 + term3;
        System.out.println(result);
    }
}
