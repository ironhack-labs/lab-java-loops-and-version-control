import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        int[] elements = {292, 5, -1, 113, 88};
        Arrays.sort(elements);
        int smallest = elements[0];
        int smallest2 = elements[1];
        System.out.println("The smallest element is:" + smallest);
        System.out.println("The second smallest element is:" + smallest2);
    }
}
