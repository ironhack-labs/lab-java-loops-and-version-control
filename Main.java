import java.util.Arrays;

public class Main {

        public static void main(String[] args) {
            int[] numbers = {5, 8, 15, 17, 32, 27, 48};

            //Task 1 - Write a Java method that returns the difference between the largest and smallest values
            // in an array of integers. The length of the array must be at least 1.
            System.out.println("Task 1 - Difference: " + difference(numbers));

            //Task 2 - Write a Java method that finds the smallest and second smallest elements of a
            // given array and prints them to the console.
            int[] smallestValues = findTwoSmallesElement(numbers);
            System.out.println("Task 2 - Smallest number: " + smallestValues[0] + " || Second smallest number: " + smallestValues[1]);

            //Task 3 - Write a Java method that calculates the result of the following mathematical
            // expression, where x and y are two variables that have been pre-set in your code:
            double x = 3;
            double y = 7;
            System.out.println("Task 3 - Formula result: " + calculateFormula(x, y));

        }

        public static int difference(int[] array){
            Arrays.sort(array);
            return array[array.length-1]-array[0];
        }

        public static int[] findTwoSmallesElement(int[] array) {
            Arrays.sort(array);
            int smallest = array[0];
            int secondSmallest = array[1];

            return new int[] {smallest, secondSmallest};
        }

        public static double calculateFormula(double x, double y){
            return (Math.pow(x, 2) + Math.pow(( ((4*y)/5) - x ), 2) );
        }
}

