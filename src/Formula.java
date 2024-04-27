public class Formula {
    public static void main(String[] args) {

        int x = 8;
        int y = 5;

        int fraction = Integer.parseInt("4" + y);

//
//        double formula = x * x + (((double) fraction /5 - x) * ((double) fraction /5 - x));
//        System.out.println(formula);
        int square = x * x;
        double splitIt = (double) fraction / 5;
        double subtractIt = (double) (splitIt - x);
        double nowSquareIt = subtractIt * subtractIt;
        double result = square + nowSquareIt;
        System.out.println(result);

    }
}



//You haven’t submitted a Pull Request, click on the button
//below and submit one to get automated feedback please
//
//The url should be something like:
//https://github.com/ironhack-labs/{name-of-the-lab}/pull/{number}