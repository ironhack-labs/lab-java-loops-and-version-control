public class Task2 {
    public static void findSmallestElements(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
          for (int value : array) {
            if (value < smallest) {
                secondSmallest = smallest;
                smallest = value;
            } else if (value < secondSmallest && value != smallest) {
                secondSmallest = value;
            }
        }
        System.out.println("Smallest element: " + smallest);
        System.out.println("Second smallest element: " + secondSmallest);
    }
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 7};
        findSmallestElements(array);
    }
}