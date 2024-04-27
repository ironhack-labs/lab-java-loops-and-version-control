public class Task3 {
    public static void main(String[] args) {
        //Write a Java method that calculates the result of the following mathematical expression, where x and y are two variables that have been pre-set in your code:

        /*

        int x = 8;
        int y = 5;

        //x² + (4y/5 - x)²

        //firstly, calculate x²

        int part1 = (x * x);

        System.out.println("Result of the first part of the equation = " + part1);

        // calculate the second part of the equation

        int part2 = (  (((4 * 4) + (y * y)) / (5 * 5)) - (x * x));

        System.out.println("Resul of the second part of the equation = " + part2);

        //Will put it all together now

        System.out.println("The result of the equation is = " + (part1 + part2));

        */



        //x²+(4y/5-x)²

        int x = 8;
         int y = 5;
         double firstPart = Math.pow(x, 2) +  Math.pow((4 * y), 2) / 5 - Math.pow(x, 2); {
            System.out.println(" Equation solution: " + firstPart);
        }





    }
}
