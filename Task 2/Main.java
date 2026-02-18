import java.util.Arrays;

public class Main {
    public static void printTwoSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }
        Arrays.sort(arr); 
        System.out.println("Smallest: " + arr[0]);
        System.out.println("Second Smallest: " + arr[1]);
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 5, 9};
        printTwoSmallest(arr);
    }
}
