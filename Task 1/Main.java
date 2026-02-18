public class Main {
    public static int differenceLargestSmallest(int[] arr) {
        if (arr == null || arr.length < 1) {
            System.out.println("Array is empty or null.");
            return 0;
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        return max - min;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9};
        int result = differenceLargestSmallest(arr);
        System.out.println("Difference is: " + result);
    }
}

// import java.util.Arrays;

// public class Main {

//     public static int differenceLargestSmallest(int[] arr) {
//         if (arr == null || arr.length < 1) {
//             System.out.println("Array is empty or null.");
//             return 0;
//         }
//         Arrays.sort(arr);
//         return arr[arr.length - 1] - arr[0];
//     }
//     public static void main(String[] args) {
//         int[] arr = {3, 1, 4, 1, 5, 9};
//         int result = differenceLargestSmallest(arr);
//         System.out.println("Difference is: " + result);
//     }
// }

