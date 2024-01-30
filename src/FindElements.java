public class FindElements {

    public static void findSmallestAndSecondSmallest(int[] array) {
        // Edge case: If the array has less than 2 elements, we cannot find both smallest and second smallest numbers.
        if (array.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Loop through the array to find the smallest and second smallest elements
        for (int value : array) {
            if (value < smallest) {
                secondSmallest = smallest;
                smallest = value;
            } else if (value < secondSmallest && value != smallest) {
                secondSmallest = value;
            }
        }

        // Check if the second smallest was updated, if not, array elements might be all same
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("There is no distinct second smallest element in the array.");
        } else {
            System.out.println("Smallest Element: " + smallest);
            System.out.println("Second Smallest Element: " + secondSmallest);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 2, 1, 4};
        findSmallestAndSecondSmallest(numbers);
    }
}
