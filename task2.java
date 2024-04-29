public class task2 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : array) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        System.out.println("Smallest Element: " + smallest);
        System.out.println("Second Smallest Element: " + secondSmallest);
    }
}
