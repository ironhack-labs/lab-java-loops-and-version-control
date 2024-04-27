import java.util.Arrays;

public class Lab1 {

    public static void main(String[] args) {

        int[] numbers = {5, -2, 11, 3456, 0, -5585};
        double x = 2;
        double y = 3;

        System.out.println("Task 1: " + task1(numbers));
        System.out.println("Task 2: " + Arrays.toString(task2(numbers)));
        System.out.println("Task 3: " + task3(x, y));

    }

    public static int task1(int[] numbers) {

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max - min;
    }

    public static int[] task2(int[] numbers) {

        Arrays.sort(numbers);

        int[] results = {numbers[0], numbers[1]};

        return results;

    }

    public static double task3(double x, double y) {

        return (x * x) + ((4 * y) / 5 - x) * ((4 * y) / 5 - x);
    }

}