public class Task3 {
    public static double calculateExpression(double x,double y){
        return Math.pow(x,2)+ Math.pow((4*y/5)-x,2);
    }

    public static void main(String[] args) {
        double x = 9.0;
        double y = 3.0;
        double result = calculateExpression(x,y);
        System.out.println("Result of the expression :" + result);

    }
}
