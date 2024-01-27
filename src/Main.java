public class Main {

    public static void main(String[] args) {

        int[] arrayNums = {6, 9, 10, 90, 7, 5, 33, -44, 1, -44, -44, -6};
        differencesBetween(arrayNums);
        System.out.println("--------------------");
        firstAndSecondSmaller(arrayNums);
        System.out.println("--------------------");
        calculation(2,13);


    }
    // Write a Java method that returns the difference between the largest and smallest values in an array of integers. The length of the array must be at least 1.
    public static int differencesBetween(int[] arr) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int numbers : arr) {
            if (numbers < min) {
                min = numbers;
            } else if (numbers > max) {
                max = numbers;
            }
        }

        int diff = max - min;

        System.out.println("The smallest number is: " + min);
        System.out.println("The largest number is: " + max);
        System.out.println("The difference between the largest and smallest values is: " + (max - min));
        return diff;

    }

    // Write a Java method that finds the smallest and second smallest elements of a given array and prints them to the console.

    public static void firstAndSecondSmaller(int[] arr) {

        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int numbers : arr) {
            if (numbers < min) {
                min2 = min;
                min = numbers;
            } else if (numbers < min2 && numbers != min)  {
                min2 = numbers;
            }
        }
        System.out.println("The smallest number is: " + min + ", and The second smallest number is: " + min2);


    }

    // Write a Java method that calculates the result of the following mathematical expression, where x and y are two variables that have been pre-set in your code:

    public static double calculation(double x, double y) {

        double total = Math.pow(x,2) + Math.pow((((4*y)/5 - x)),2);
        System.out.println(total);
        return total;

    }


}
