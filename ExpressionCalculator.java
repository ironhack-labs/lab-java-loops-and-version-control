public class ExpressionCalculator {

    //Method to calculate the expression x^2 + (4Y/5 - x)^2
    public static double calculateExpressions(double x, double y){
        // calculate the components of the expressions
        double term1 = Math.pow(x,2);
        double term2 = Math.pow((4 * y / 5 - x), 2);

        //calculate the final result
        double result = term1 + term2;

        return result;
    }
    public static void main(String[] args) {
        //let us assume that x and y are pre-existing
        double x = 2.0;
        double y = 5.0;

        //let us calculate the expression

        double expressionResults = calculateExpressions(x, y);

        //print results
        System.out.println("The results of the expression x^2 + (4Y/5 - x)^2 for x = " + x + " and for y = " + y + " is: " + expressionResults);

    }
}
