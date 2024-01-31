public class DiffMaxMin {
    public static int calculateDifference(int[] numbers) {
        if (numbers.length < 1) {
            System.err.println("The length of the array must be at least 1");
        }
        int max = 0;
        int min = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min || i == 0) {
                min = numbers[i];
            }

            if (numbers[i] > max || i == 0) {
                max = numbers[i];
            }
        }
        
        return max - min;
        
    }
}
