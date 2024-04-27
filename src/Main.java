public class Main{

    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 3, 12, 7};
        int difference = calculateDifference(numbers);
        System.out.println("The difference between the largest and smallest values is: " + difference);
    }
    public static int calculateDifference(int[] arr) {
        if (arr.length < 1) {
            System.out.println("Array must have at least 1 element.");
            return -1;
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max - min;
    }
}