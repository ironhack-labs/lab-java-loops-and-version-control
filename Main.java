public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    public static int diffMaxMin(int[] numArray) {
        int max = 0;
        int min = 0;
        for (int eachNum : numArray) {
            if (min > eachNum) {
                min = eachNum;
            }
            if (max < eachNum) {
                max = eachNum;
            }
        }
        return max - min;
    }

    public static void smallestAndSecondSmallest(int[] numArray) {
        int smallest = 0;
        int secondSmallest = 0;
        for (int eachNum : numArray) {
            if (smallest > eachNum) {
                smallest = eachNum;
            } else if (secondSmallest > eachNum) {
                secondSmallest = eachNum;
            }
            System.out.println(smallest);
            System.out.println(smallest);
        }
    }

    public static double expression(double x, double y) {
        return Math.pow(x, 2) + Math.pow(((4 * y / 5) - x), 2);
    }
}
