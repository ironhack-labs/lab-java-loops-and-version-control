package MyJavaProject.src.main.java.com.yourpackage;
public class SmallestElements {

    // Method to find and print the smallest and second smallest elements in an array
    public static void findSmallestAndSecondSmallest(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }

        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int value : array) {
            if (value < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = value;
            } else if (value < secondSmallest && value != firstSmallest) {
                secondSmallest = value;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element.");
        } else {
            System.out.println("The smallest element is: " + firstSmallest);
            System.out.println("The second smallest element is: " + secondSmallest);
        }
    }

    // Main method to test the findSmallestAndSecondSmallest method
    public static void main(String[] args) {
        int[] testArray = {3, 5, 1, 9, 2, 8};
        findSmallestAndSecondSmallest(testArray);
    }
}
