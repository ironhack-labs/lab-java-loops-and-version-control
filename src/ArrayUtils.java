public class ArrayUtils {

public static void findSmallestAndSecondSmallest(int[] arr) {
    if (arr == null || arr.length < 2) {
        throw new IllegalArgumentException("Array must have at least two elements");
    }

    int firstMin = Integer.MAX_VALUE;
    int secondMin = Integer.MAX_VALUE;

    for (int value : arr) {
        if (value < firstMin) {
            secondMin = firstMin;
            firstMin = value;
        } else if (value < secondMin && value != firstMin) {
            secondMin = value;
        }
    }

    if (secondMin == Integer.MAX_VALUE) {
        System.out.println("There is no second smallest element");
    } else {
        System.out.println("The smallest element is: " + firstMin);
        System.out.println("The second smallest element is: " + secondMin);
    }
}

        public static void main(String[] args) {
            int[] array = {3, 5, 1, 9, 2};
            findSmallestAndSecondSmallest(array);
        }
    }


