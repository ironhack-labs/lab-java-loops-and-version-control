public class SmallestElements {

    public static void findSmallestElements(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element.");
        } else {
            System.out.println("Smallest element: " + smallest);
            System.out.println("Second smallest element: " + secondSmallest);
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 3, 4, 7, 2, 9, 5};
        findSmallestElements(array);
    }
}

//i need to confess that i din't get it right, the teacher exemples solved the parts i had no idea how to solve.