import static java.lang.Integer.MAX_VALUE;

public class Task2TrainingwithMatej {
    public static void main(String[] args) {

        int [] numbers = {57, 9, 12, 564, 85,  874};
        // i = 0   1  2    3    4   5

        int minNumber = MAX_VALUE; //9
        int maxNumber = 0;//874
        // constant 5 (6) | IT WILL ADD 1 TO i
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];

                //    874   >    85 = true or false
            } else if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];

            } else {
                System.out.println("It's not highest nor lowest number " + numbers[i]);
            }

        }
        System.out.println("Smallest value is " + minNumber);
        System.out.println("Highest value is " + maxNumber);

        System.out.println("Difference between the smallest value and highest value is " + (maxNumber - minNumber));

    }

}