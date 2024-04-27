public class element {
    public static void main(String[] args) {
        int[] numbers = {122, 54, 27, 6, 91};
        findSmallestElements(numbers);
    }

    public static void findSmallestElements(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array length must be at least 2.");
            return;
        }

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < firstMin) {
                secondMin = firstMin;
                firstMin = num;
            } else if (num < secondMin && num != firstMin) {
                secondMin = num;
            }
        }

        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("The array contains only one distinct value: " + firstMin);
        } else {
            System.out.println("The smallest element is: " + firstMin);
            System.out.println("The second smallest element is: " + secondMin);
        }
    }
}