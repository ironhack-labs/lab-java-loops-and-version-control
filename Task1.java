public class Task1 {
    public static int getDifferenceBetweenMaxAndMin(int[] array) {

        if (array.length < 1) {
            throw new IllegalArgumentException("Array must have at least one element.");
        }

        int max = array[0];
        int min = array[0];


        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }


        return max - min;
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 1, 9, 2};
        System.out.println("Difference between max and min: " + getDifferenceBetweenMaxAndMin(array));
    }
}
