import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbersArray = {1,2,2,4,12};
        System.out.println(difference(numbersArray)); // Result Task 1
        getSmallestAndSecondSmallest(numbersArray); // Result Task 2
        int x = 2;
        int y = 3;
        System.out.println(calculateMathExpression(x,y)); // Result Task 3
    }

    // method Task 1
    public static int difference(int[] numbersArray){
        int largestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;
        for(int number : numbersArray){
           if(number < smallestNumber) smallestNumber = number;
           if(number > largestNumber) largestNumber = number;
        }
        return largestNumber - smallestNumber;
    }

    // method Task 2
    public static void getSmallestAndSecondSmallest(int[] numbersArray) {
        Arrays.sort(numbersArray);
        int smallestIndex = numbersArray[0];
        int secondSmallestIndex = numbersArray[1]; // Initialize to the second element
        for (int i = 1; i < numbersArray.length; i++) { // Start from the second element
            if (numbersArray[i] != smallestIndex) { // Find the second smallest distinct element
                secondSmallestIndex = numbersArray[i];
                break; // Exit loop once found
            }
        }
        System.out.println(smallestIndex + " " + secondSmallestIndex);
    }


    // method Task 3
    public static double calculateMathExpression(int x, int y){

        return  Math.pow(x, 2) - Math.pow(((4.0 * y) / 5),2);

    }


}
