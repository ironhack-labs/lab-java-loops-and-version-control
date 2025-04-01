public class Main {

    private static final int x = 2;
    private static final int y = 5;

    public static void main(String[] args) {

    }

    public static int minMaxDifference(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return max - min;
    }

    public static void printSmallestAndSecondSmallest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        if(secondSmallest == Integer.MAX_VALUE){
            secondSmallest = smallest;
        }
        System.out.println("Smallest: " + smallest + ", Second Smallest: " + secondSmallest);

    }

    public static int expression(){
        return x*x + (4*y/5 - x)*(4*y/5 - x);
    }
}
