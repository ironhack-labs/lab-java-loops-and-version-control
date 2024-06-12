package src;

public class Main {
    public static void main(String[] args) {

        int[] numbersArray = {2, 5, 3, -7, 9, 5, -2, 5, 6};
        int differenceNumberResult =  largestAndSmallestNumberDifference(numbersArray);
        System.out.println("the difference between largest and smallest numbers is: " + differenceNumberResult);

        smallestAndSecondSmallestNumber(numbersArray);
        double result = mathProblemSolver(2,  2);
        System.out.println("The result of the math is: " + result);

    }

    public static int largestAndSmallestNumberDifference(int[] numbersArray) {

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < numbersArray.length; i++) {

            if (numbersArray[i] < smallest) smallest = numbersArray[i];
            if (numbersArray[i] > largest) largest = numbersArray[i];

        }
//        System.out.println("Smallest: " + smallest);
//        System.out.println("Largest: " + largest);
        return  largest - smallest;
    }

    public static void smallestAndSecondSmallestNumber (int[] numbersArray) {

        int smallestNum = Integer.MAX_VALUE;
        int secondSmallestNum = Integer.MAX_VALUE;

        for(int i = 0; i < numbersArray.length; i++){
            if(numbersArray[i] < smallestNum) {
                secondSmallestNum = smallestNum;
                smallestNum = numbersArray[i];
            } else if(numbersArray[i] < secondSmallestNum && numbersArray[i] != smallestNum){
                secondSmallestNum = numbersArray[i];
            }
        }
        System.out.println("Smaller number: " + smallestNum);
        System.out.println("Second Smallest number: " + secondSmallestNum);
    };
    public static double mathProblemSolver(int x, int y){
        int expo = (x*x);
        double div = (4.0 * y) / 5;
        double minus = div - x;
        double expo2 = minus * minus;

        return expo + expo2;

    };
}