public class Array {

    public static int getDifferenceBetweenLargestAndSmallest(int[] arr) {
    if (arr == null || arr.length == 0) {
        throw new IllegalArgumentException("Array must have at least one element");
    }

    int min = arr[0];
    int max = arr[0];

    for (int value : arr) {
    if (value < min) {
    min = value;
  }
  if (value > max) {
    max = value;
}
}

 return max - min;
}

public static void main(String[] args) {
    int[] array = {3, 5, 1, 9, 2};
    System.out.println("Difference: " + getDifferenceBetweenLargestAndSmallest(array)); // Output: 8
}
}



