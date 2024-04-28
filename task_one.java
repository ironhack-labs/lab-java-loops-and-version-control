public class task_one {
    public static int findDifference(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
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

        int difference = max - min;
        return difference;
    }


    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 3, 7};
        System.out.println("Difference: " + findDifference(arr));
    }
}


