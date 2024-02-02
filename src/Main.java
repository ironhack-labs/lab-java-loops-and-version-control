import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers1 = {1, 3, 5, 7, 9};
        int[] numbers2 = {20, 7, 2, 10, 1, 8,};

        System.out.println(MathGenie.calculateDifference(numbers1));
        System.out.println(Arrays.toString(MathGenie.findSmallestAndSecondSmallest(numbers2)));
        System.out.println(MathGenie.magicFormula(2d, 3d));
    }
}
