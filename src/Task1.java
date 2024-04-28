public class Task1 {
    public static int calculator(int[] myNumbers) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int value : myNumbers) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }
        return max - min;
    }

    public static void main(String[] args) {
        int[] myNumbers = {9, 16, 23, 38};
        int difference = calculator(myNumbers);
        System.out.println("The difference between the largest and the smallest value is " + difference + "!");
    }

}