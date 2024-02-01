public class Task1 {
    public static int findDifference(int[] array) {
        if (array.length < 1) {
            throw new IllegalArgumentException("Array must have at least one element.");
        }

        int min = array[0];
        int max = array[0];

        for (int value : array) {
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
        int[] array = {5, 2, 9, 1, 7};
        int difference = findDifference(array);
        System.out.println("Difference between largest and smallest values: " + difference);
    }

}