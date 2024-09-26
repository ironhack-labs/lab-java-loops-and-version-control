public class Main {
    public static void main(String[] args){

        // TASK 1
        int[] myNumbers = {10, 4, 1, 2, 3, 9, 8, 7, 6, 5};

        int min = myNumbers[0];
        int max = myNumbers[0];

        for (int i = 1; i < myNumbers.length; i++) {
            if (myNumbers[i] < min) {
                min = myNumbers[i];
            } else if (myNumbers[i] > max) {
                max = myNumbers[i];
            }
        }
        System.out.println(min);
        System.out.println(max);

        // RESULT OF TASK 1
        System.out.println(max - min);


        // TASK 2

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : myNumbers) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        //RESULT OF TASK 2
        System.out.println("Smallest element: " + smallest);
        System.out.println("Second smallest element: " + secondSmallest);


        // TASK 3
        double x = 5;
        double y = 2;
        double result = Math.pow(x, 2) + Math.pow((4 * y % 5 - x), 2);

        //RESULT OF TASK 3
        System.out.println(result);

    }
}