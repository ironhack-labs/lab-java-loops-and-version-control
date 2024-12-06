package src;

public class Task2 {
    public static void main(String[] args) {

        int[] array = {3, 7, 4, 2, 6};
        smallestAndSecondSmallest(array);

    }

    public static void smallestAndSecondSmallest(int[] arra) {

        if (arra.length < 2) {
            System.out.println("It should contain at least 2 elements !");

        }

        int smallest = arra[0];
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 1; i < arra.length;i++){
            if (arra[i] < smallest) {
                secondSmallest = smallest;
                smallest = arra[i];
            } else if (arra[i] < secondSmallest && arra[i] != smallest) {
                secondSmallest = arra[i];

            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element found.");
        } else {
            System.out.println("Smallest element: " + smallest);
            System.out.println("Second smallest element: " + secondSmallest);


        }
    }}






//        if (arr == null || arr.length < 2) {
//            System.out.println("Array should have at least two elements.");
//            return;
//        }
//
//        int smallest = Integer.MAX_VALUE;
//        int secondSmallest = Integer.MAX_VALUE;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < smallest) {
//                secondSmallest = smallest;
//                smallest = arr[i];
//            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
//                secondSmallest = arr[i];
//            }
//        }
//
//        if (secondSmallest == Integer.MAX_VALUE) {
//            System.out.println("No second smallest element found.");
//        } else {
//            System.out.println("Smallest element: " + smallest);
//            System.out.println("Second smallest element: " + secondSmallest);
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] array = {3, 5, 1, 4, 2, 6};
//        findSmallestAndSecondSmallest(array);
//





