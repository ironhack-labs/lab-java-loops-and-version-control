public class ArithmeticOperations {
    public static double magicFormula(double x, double y) {
        double leftSide = Math.pow(x, 2);
        double rightSide = Math.pow(((4 * y) / 5) - x, 2);

        return  leftSide + rightSide;
    }
}
