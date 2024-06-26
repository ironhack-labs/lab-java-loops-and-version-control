//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Loops {
    public static void main(String[] args) {

        System.out.println("Task 1");
        //Task 1
        //Write a Java method that returns the difference between
        // the largest and smallest values in an array of integers.
        // The length of the array must be at least 1.

        int array[] = {10, 14, 2, 53, 100, 122};

        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            // If current element is smaller than smallest element, update MIN number
            if (array[i] < min) {
                min = array[i];
            }
            // If current element is bigger than biggest element, update MAX number
            for (int t = 0; t <= 5; t++) {
                if (array[i] > max) {
                    max = array[t];
                }

                int differenceOfMaxMin = max - min;
                System.out.println("The difference of the biggest number and the minimum number is: " + differenceOfMaxMin);
            }
        }
        System.out.println("Minimum element from array is: " + min);
        System.out.println("Maximum element from array is: " + max);

    }
}

