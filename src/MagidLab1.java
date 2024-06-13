public class MagidLab1 {
    public static int differenceBetweenLargestAndSmallest(int[] array) {

        if (array.length == 0) {
            System.out.println("There was a problem with the array");
        }

        int largest = array[0];
        int smallest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }

            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        return largest - smallest;
    }

    // Lab1 ii
    public static void findFirstAndSecondSmallest(int[] array) {
        int min = array[0];
        int secondMin = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                secondMin = min;
                min = array[i];
            } else if (array[i] < secondMin) {
                secondMin = array[i];
            }
            System.out.println(array[i]);
        }

    }

// Lab1 iii


    public static double mathematicalProblems(double x, double y) {
        double result = 0.0;
        double xPow = x * x;
        double loopVariable = 1;
        for (int i = 0; i < 2; i++) {
            loopVariable = loopVariable * (4 * y / 5 - x);
        }
        result = xPow + loopVariable;
        return result;

    }
}



