
//Task 1
public class LabOne {
    public LabOne() {
    }

    public static void main(String[] args) {
        int[] array = new int[]{15, 22, 8, 19, 31, 7, 53};
        int largest = array[0];
        int smallest1 = array[0];

        int i;
        for(i = 1; i < array.length; ++i) {
            if (array[i] > largest) {
                largest = array[i];
            }

            if (array[i] < smallest1) {
                smallest1 = array[i];
            }
        }
//Task 2
        i = largest - smallest1;
        System.out.println("Difference between the largest and smallest values: " + i);
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(i = 0; i < array.length; ++i) {
            if (array[i] < smallest) {
                secondSmallest = smallest;
                smallest = array[i];
            } else if (array[i] < secondSmallest && array[i] != smallest) {
                secondSmallest = array[i];
            }
        }

        System.out.println("Smallest element: " + smallest);
        System.out.println("Second smallest element: " + secondSmallest);

//Task 3
        int x = 3;
        int y = 5;
        double result = Math.pow((double)x, 2.0) + Math.pow(4.0 * (double)y / 5.0 - (double)x, 2.0);
        System.out.println("Result of the expression: " + result);
    }
}