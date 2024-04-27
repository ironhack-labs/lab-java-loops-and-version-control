public class Task3 {
    public static void main(String[] args) {
        int x = 2; //x=2
        double y = 3; //y = 3
        double result = calculateExpression(x, y);
        System.out.println("The result of the expression is: " + result);
    }
    public static double calculateExpression(int x, double y) {
        return (Math.pow(x , 2)+Math.pow((((4 * y)/5 )-x),2));
        //return (3 * x) + (4 * y);
    }
}