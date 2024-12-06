package src;

public class Task3 {
    public static double mathTask(double x, double y) {



        double firstExp = Math.pow(x, 2);
        double secondExp = Math.pow((4 * y / 5) - x, 2);
        return firstExp + secondExp;

    }

    public static void main(String[] args) {

        double x = 3.0;
        double y = 7;
        double result = mathTask(x, y);
        System.out.println("Result is : " + result);



    }

    }

