public class task_two {
    public static void findSmallestElements(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null.");
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        System.out.println("Smallest element: " + smallest);
        System.out.println("Second smallest element: " + (secondSmallest == Integer.MAX_VALUE ? "No second smallest element" : secondSmallest));
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 3, 7};
        findSmallestElements(arr);
    }
}
