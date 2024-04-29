public class task1 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };

        // Calculate the difference between largest and smallest values
        int smallest = array[0];
        int largest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        int difference = largest - smallest;
        System.out.println("Difference between largest and smallest values: " + difference);
    }
}