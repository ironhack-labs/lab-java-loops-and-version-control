package MyJavaProject.src.main.java.com.yourpackage;

public class ArrayDifference {
    // Method to find the difference between the largest and smallest values in an array
    public static int findDifference(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }

        return max - min;
    }

    // Main method to test the findDifference method
    public static void main(String[] args) {
        int[] testArray = {3, 5, 1, 9, 2, 8};
        int difference = findDifference(testArray);
        System.out.println("The difference between the largest and smallest values is: " + difference);
    }
}
