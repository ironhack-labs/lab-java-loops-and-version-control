

public class MathermaticalExpression {

    public static void print() {

        // set doubles for floats, and Math.pow method only accepts doubles
        double xVar = 2;
        double yVar = 5;

        // Calculate breakdown

        // calculate what is x²
        double first = Math.pow(xVar,xVar);

        // calculate whit is between the brackets
        double second = (4 * yVar / 5) - xVar;

        // add both up and calculate the power of the second var
        double result = first + Math.pow(second, 2);

        // Print the result
        System.out.println("The result is : " + result);


    }




}
