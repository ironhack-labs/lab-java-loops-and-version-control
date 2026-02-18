package az.tanz;

public class Task3 {
    public static double mathfunc(int x, int y){
        double result = Math.pow(x, 2) + Math.pow(((4.0 * y) / 5.0) - x, 2);

        return (double) result;

    }
}
