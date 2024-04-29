import java.util.Arrays;

public class SmallestSecondSmallest {

    public static void print() {

        //importing sort method to sort the array

        int[] numbers = {-5,32,3,23,-66,80,42};

        //call sort method on array

        Arrays.sort(numbers);

        // print to console

        System.out.println("Smallest : " + numbers[0]);
        System.out.println("Second smallest : " + numbers[1]);

    }
}
