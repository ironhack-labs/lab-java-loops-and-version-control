import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbersArray = {2,3,4,3,1,4,12};
        System.out.println(difference(numbersArray)); // Result Task 1
        getSmallestAndSecondSmallest(numbersArray); // Result Task 2
        int x = 2;
        int y = 3;
        System.out.println(calculateMathExpression(x,y)); // Result Task 3
    }

    // method Task 1
    public static int difference(int[] numbersArray){
        int largestNumber = 0;
        int smallestNumber = 0;
        for(int number : numbersArray){
           if(number < smallestNumber) smallestNumber = number;
           if(number > largestNumber) largestNumber = number;
        }
        return largestNumber - smallestNumber;
    }

    // method Task 2
    public static void getSmallestAndSecondSmallest(int[] numbersArray){
        Arrays.sort(numbersArray);
        System.out.println(numbersArray[0] + " " + numbersArray[1]);
    }

    // method Task 3
    public static int calculateMathExpression(int x, int y){

        return  x * x + ((4*y / 5) - x) * ((4*y/ 5)- x);
    }


}
