import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Input array
        int[] arrayNum = {2,5,7,3,9};
        System.out.println("The input array is: " + Arrays.toString(arrayNum));

        // Print difference between largest and smallest numbers in the array
        System.out.println("Exercise 1 :\n The difference between the min and max values in the array is " + e1(arrayNum) + ".");

        // Print the smallest and second-smallest numbers in the array
        System.out.println("Exercise 2 :\n The smallest number in the array is " + minsOfArray(arrayNum)[0] + ", followed by " + minsOfArray(arrayNum)[1] + ".");

        // Input x and y values
        double x = 1;
        double y = 2;
        // Print the result of the formula
        System.out.println("Exercise 3 :\n The result of the formula for x = " + x + " and y = " + y + ", is " + e2(x,y) + ".");
    }

    public static int e1(int[] arrayNum){
        // get smallest and largest numbers of array calling to the corresponding methods
        int min = minsOfArray(arrayNum)[0];
        int max = maxOfArray(arrayNum);
        return max-min;
    }

    public static int[] minsOfArray(int[] arrayNum){
        // initialize variables to store the smallest number of the array
        int min = arrayNum[0];
        int minProv = arrayNum[0];

        // check min number in the array
        for (int i = 0; i < (arrayNum.length)-1; i++){
            if (arrayNum[i] > arrayNum[i+1]){
                minProv = arrayNum[i+1];
            }

            if (minProv < min){
                min = minProv;
            }
        }
        int[] minimums = {min,minProv};
        return minimums;
    }

    public static int maxOfArray(int[] arrayNum){
        // initialize variables to store the largest number of the array
        int max = arrayNum[0];
        int maxProv = arrayNum[0];

        // check max number in the array
        for (int i = 0; i < (arrayNum.length)-1; i++){
            if (arrayNum[i] < arrayNum[i+1]){
                maxProv = arrayNum[i+1];
            }

            if (maxProv > max){
                max = maxProv;
            }
        }

        return max;
    }

    public static double e2(double x, double y){
        // introduce the formula
        return Math.pow(x,2)+Math.pow((4*y/5 - x),2);
    }
}