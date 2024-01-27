
public class Task3 {
    public static void main(String[] args) {
        double x = 5;
        double y = 10;

        double term1 = Math.pow(x , 2);
        double term2 = y * 4 / 5 - x;
        double term3 = Math.pow(term2, 2);

        double result = term1 + term3;
        System.out.println(result);
    }
}
