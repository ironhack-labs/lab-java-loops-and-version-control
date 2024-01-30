public class ArrayUtil {
    // Find the difference between the largest and smallest numbers in an array
    public static int findDifference(int[] array) {
        // Initialize variables to store the smallest and largest numbers
        // We start by assuming the first element is both the smallest and largest
        int min = array[0];
        int max = array[0];

        // Loop through the array to find the smallest and largest numbers
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Return the difference between the largest and smallest numbers
        return max - min;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 4};
        System.out.println("Difference: " + findDifference(numbers));
    }
}
