public class MathGenie {
    public static int calculateDifference(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("The length of the array must be at least 1");
        }
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max - min;

    }

    public static int[] findSmallestAndSecondSmallest(int[] numbers) {
        int smallest = numbers[0];
        int secondSmallest = numbers[1];

        for (int i = 2; i < numbers.length; i++) {
            if(secondSmallest < smallest) {
                int tempSmallest = smallest;
                smallest = secondSmallest;
                secondSmallest = tempSmallest;
            }
            if (numbers[i] < smallest) {
                int tempSmallest = smallest;
                smallest = numbers[i];
                secondSmallest = tempSmallest;

            } else if (numbers[i] < secondSmallest) {
                secondSmallest = numbers[i];
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static double magicFormula(double x, double y) {
        double leftSide = Math.pow(x, 2);
        double rightSide = Math.pow(((4 * y) / 5) - x, 2);

        return  leftSide + rightSide;
    }
}
