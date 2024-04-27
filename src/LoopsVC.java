import java.util.Arrays;

public class LoopsVC {
    public static void main(String[] args) {
        //first creating an array of integers
        int[] numbers = {45, 68, 109, 26, 9, 297,2};
        //assigning variable for highest number

//        creating a loop that will go through the array compare the values and find
//          the highest and the lowest number
        int highestNumber = 0;
        int lowestNumber = Integer.MAX_VALUE;
        int secondLowestNumber = 0;
//        Arrays.sort(numbers);
        System.out.println(numbers);
        for (int num : numbers) {
//            System.out.println(num);

            if ( num < lowestNumber) {
                secondLowestNumber = lowestNumber;
                lowestNumber = num;
//                if (num > lowestNumber && secondLowestNumber < highestNumber){
//                    secondLowestNumber = num;
            } else if (num < secondLowestNumber && num != lowestNumber) {
                secondLowestNumber = num;
            }

             else if (num > highestNumber) {
                highestNumber = num;


//                int x = Integer.MAX_VALUE;
//                int y = Integer.MIN_VALUE;
//
//                System.out.println("max value is" + x);
//                System.out.println("min value is" + y);

            }
        }
        System.out.println("The highest value is " + highestNumber);
        System.out.println("The lowest value is " + lowestNumber);
        System.out.println("The second lowest value is " + secondLowestNumber);
        System.out.println("The difference between " + highestNumber + " and " + lowestNumber + " is " + (highestNumber - lowestNumber));

    }
}
//