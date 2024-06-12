public class MinMax {
    public static int MinMax(int[] array) {
        if (array.length == 0) {
            return 0;
        }
//        VARIABLES
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for (int num : array) {
            maxNum = Math.max(maxNum, num);
            minNum = Math.min(minNum, num);
        }

        return maxNum - minNum;
    }

    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        int difference = MinMax(nums);
        System.out.println("Difference between Maximun and Minimun values: " + difference);
    }
}