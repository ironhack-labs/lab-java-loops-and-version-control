public class Task1 {
    public static void main(String[] args) {
        // Task number 1
        int[] numbers = {69, 100, 88, 24, 2024};
        int minValue = numbers[0]; //69
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        System.out.println("Smallest Value of this array is: " + minValue);
        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        System.out.println("Highest Value of this array is: " + maxValue);
        System.out.println("The difference between the minimum and maximum values: " + (maxValue - minValue));
    }
}