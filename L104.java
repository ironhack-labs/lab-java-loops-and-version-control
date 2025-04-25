
import java.util.Arrays;


public class L104 {
    public static void main(String[] args) {


        int[] arrayLab104 = {13, 5, 756, 19, 11, 13, 151, 9};

        System.out.println("Task 1");
        int difference = checkDiff(arrayLab104);
        System.out.println("The difference between the largest and the smallest number is: " + difference);
        //System.out.println("The difference between the smallest and the largest number is: " + checkDiff(arrayLab104));
        System.out.println("\nTask 2");
        smallestSecondSmallest(arrayLab104);

        System.out.println("\nTask 3");
        double result = mathCheck();
        System.out.println("Result for task 3 is: " + result);


    }

    public static int checkDiff(int[] arrayLab104) {
        //System.out.println("The array to check is: " + Arrays.toString(arrayLab104) +"\n");

        int smallestN = arrayLab104[0];
        int largestN = arrayLab104[0];

        for (int i = 1; i < arrayLab104.length; i++) {
            if (arrayLab104[i] < smallestN) {
                smallestN = arrayLab104[i];
            }
        }

        for (int i = 1; i < arrayLab104.length; i++) {
            if (arrayLab104[i] > largestN) {
                largestN = arrayLab104[i];

            }
        }

        int diffN = largestN - smallestN;
        /*System.out.println("the smallest number:  " + smallestN);
        System.out.println("the largest number: " + largestN);
        System.out.println("The difference between largest and smallest: " + diffN);


        System.out.println("End of module\n");*/


        return diffN;


    }


    public static void smallestSecondSmallest(int[] arrayLab104) {
        Arrays.sort(arrayLab104);
        // System.out.println("sorted array is: " + Arrays.toString(arrayLab104));             This checks that the array is sorted
        System.out.println("\nThe smallest number is: " + arrayLab104[0]);
        System.out.println("The second smallest number is: " + arrayLab104[1]);
        //System.out.println("end of method\n");

    }


    public static double mathCheck() {
        // BIDMAS  order
        double x = 8;
        double y = 6;


        //1 bracket
        double res = Math.pow(x, 2) + Math.pow(((4 * y / 5) - x), 2);
        //System.out.println(res);

        return res;


    }
}




