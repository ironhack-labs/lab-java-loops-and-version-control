public class ArrayMinMaxDifference {
    public static int minMaxDifference(int[] arr) {
        //initialize the arrays
        int min = arr[0];
        int max = arr[0];

        //find a min and max value with a for each loop
        for (int num : arr){
            if (num < min){
                min = num; //we update minimum if the num is smaller
            }
            if (num > max){
                max = num; //we update max if the number is larger
            }
        }

        //calculate the difference between min and max and return it
        return max - min;

    }

    public static void main(String[] args) {
        int[] array = {9, 12, 5, 88, 2, 77};
        int difference = minMaxDifference(array);
        System.out.println("This is the difference between the smallest and larges value " + difference);
    }
}
