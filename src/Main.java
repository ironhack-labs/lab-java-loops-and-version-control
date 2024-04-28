public class Main {
    public static void main(String[] args) {
        int x = 3;
        double y = 4.5;
        double result = calculateExpression(x, y);
        System.out.println("The result of the expression is: " + result);

        int[] numbers = {19, 5, 10, 20, 30};
        findSmallestElements(numbers);
        System.out.println("Difference between the largest and smallest values: " + differenceBetweenMaxAndMin(numbers));


    }

    public static int differenceBetweenMaxAndMin(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max - min;
    }

    public static void findSmallestElements(int[] arr) {

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            }
        }

        System.out.println("Smallest element: " + smallest);
        System.out.println("Second smallest element: " + secondSmallest);
    }

    public static double calculateExpression(int x, double y) {
        return (Math.pow(x, 2) + Math.pow((((4 * y) / 5) - x), 2));
    }

}