
public class Main {
    private static final int MIN_INT_VALUE = Integer.MIN_VALUE;
    private static final int MAX_INT_VALUE = Integer.MAX_VALUE;

    public static int task1FindDifference(int[] arr) {
        /*Write a Java method that returns the difference between the largest and smallest values
         *in an array of integers.
         *The length of the array must be at least 1.
         */

        if (arr.length < 1) {
            throw new IllegalArgumentException("Array length should be more than 1.");
        }
        //Set min to the largest and max to the min value for integer type
        int min_value = MAX_INT_VALUE;
        int max_value = MIN_INT_VALUE;

        //check all the array to find max and min
        for (int element : arr) {
            if (element < min_value) {
                min_value = element;
            }
            if (element > max_value) {
                max_value = element;
            }
        }
        //return difference
        return max_value - min_value;
    }

    public static void task2FindSmallestAndSecondSmallest(int[] arr) {
    /*
     * Write a Java method that finds the smallest and
     * second-smallest elements of a given array and prints them to the console.
     */
        if (arr.length <2){
            throw new IllegalArgumentException("Array length should be more than 2.");
        }
        //Set min and secondMin to the largest
        int min_value = MAX_INT_VALUE;
        int second_min_value = MAX_INT_VALUE;

        //check all the array to find
        for (int element : arr) {
            if (element < min_value) {
                second_min_value = min_value;
                min_value = element;

            } else if (element < second_min_value && element != min_value) {
                second_min_value = element;
            }

        }
        //If there is not second-smallest print a warning
        if (second_min_value == MAX_INT_VALUE ) {
            System.out.println("there is not second-smallest");
        } else {
            System.out.println("2nd smallest Element: "+second_min_value);
        }
        System.out.println("Smallest Element: "+min_value);
    }
    public static void task3ResolveExpression(){
        /*Write a Java method that calculates the result of the following mathematical expression,
         where x and y are two variables that have been pre-set in your code:
         out= x^2 + (4y/5  - x)^2
        * */
        int x = 23;
        int y = 34;

        double result = Math.pow(x,2) + Math.pow((((double) (4 * y) /5) -x),2);
        System.out.println(result);

    }
    public static void main(String[] args){
        int[] sample_arr = {34,3,5,54,23,12,7};
        //int difference=task1FindDifference(sample_arr);
        //System.out.println(difference);
        //taks2FindSmallestAndSecondSmallest(sample_arr);
        //task3ResolveExpression();
    }
}