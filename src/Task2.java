import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        double[] numbers = {4.2, 9.1, 2.9, 8.5, 6.3};
      //  printSmallestTwo(numbers);

    System.out.println(Arrays.toString(numbers));

        double smallest = Integer.MAX_VALUE;
        double secondSmallest = Integer.MAX_VALUE;

        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            } else if (numbers[i] < secondSmallest && i != smallest) {
                secondSmallest = numbers[i];
            }
        }

        System.out.println("The smallest element is: " + smallest);
        System.out.println("The second smallest element is: " + secondSmallest);
    }
}
