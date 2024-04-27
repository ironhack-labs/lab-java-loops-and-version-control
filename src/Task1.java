public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {4, 9, 2, 8, 10};
        int difference = findDifference(numbers);
        System.out.println("The difference between the largest and smallest values is: " + difference);
    }

    public static int findDifference(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return max - min;
    }
}
