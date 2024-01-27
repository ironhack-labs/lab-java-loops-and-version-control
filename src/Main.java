import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] aaa = {3, 7, 12, 2, 9, 6};
        System.out.println(diffLargestSamallest(aaa));
        System.out.println(get2Samallest(aaa));
        System.out.println(mathExpression(2, 2));
    }

    private static int diffLargestSamallest(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        Arrays.sort(nums);
        return nums[nums.length - 1] - nums[0];
    }

    private static String get2Samallest(int[] nums) {
        Arrays.sort(nums);
        int[] samllests = {nums[0], nums[1]};
        return Arrays.toString(samllests);
    }

    private static int mathExpression(int x, int y) {
        int partB = ((4 * y) / 5) - x;
        return x * x + partB * partB;
    }
}