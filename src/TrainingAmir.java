public class TrainingAmir {
    public static void main(String[] args) {
        int[] numbers = {5, 7, 8, 2, 4, 0};
        // Smallest number is 0
        //Second smallest 2
        findSmallestElements(numbers);
    }

    public static void findSmallestElements(int[] arr) {

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = smallest;

        for(int numbers : arr) {
            if(numbers < smallest) {
                secondSmallest = smallest;
                smallest = numbers;
            }
        }

        System.out.println("Smallest element: " + smallest);
        System.out.println("Second smallest element: " + secondSmallest);
    }

}