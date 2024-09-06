public class Main {

    public static void main(String[] args) {
        int array[] = {1, 503, 4, 1900};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        System.out.println("Max number is " + max);
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min number is " + min);
        int difference = (max - min);
        System.out.println("The difference is "+difference);
        int smallest1 = Integer.MAX_VALUE;
        int smallest2 = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest1) {
                smallest2 = smallest1;
                smallest1 = array[i];
            } else if (array[i] < smallest2 && array[i] != smallest1)
                smallest2 = array[i];

        }
        System.out.println("The second smallest number is "+smallest2);


        double x = 2;
        double y = 3;
        double d = (4 * y / 5 - x);
        double result = x * x + d * d;
        System.out.println("The result of 3rd task is: " + result);




    }
}


