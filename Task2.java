public class Task2 {
    public static void findAndPrintSmallestAndSecondSmallest(int[] array) {

        if (array.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;


        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                secondSmallest = smallest;
                smallest = array[i];
            } else if (array[i] < secondSmallest && array[i] != smallest) {
                secondSmallest = array[i];
            }
        }


        System.out.println("Smallest element: " + smallest);
        System.out.println("Second smallest element: " + secondSmallest);
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 1, 9, 2, 1};
        findAndPrintSmallestAndSecondSmallest(array);
    }
}



