public class DiffMaxMin {
    public static int calculateDifference(int[] numbers) {
        if (numbers.length < 1) {
            System.err.println("The length of the array must be at least 1");
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
}
