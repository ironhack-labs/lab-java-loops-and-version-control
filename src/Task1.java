import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = { 50, -88, 65, 510, -300, 45, 30};

        int maxNum = Arrays.stream(numbers).max().getAsInt();
        int minNum = Arrays.stream(numbers).min().getAsInt();
        String listNumbers = Arrays.toString(numbers);
        System.out.println(listNumbers);
        System.out.println("The lowest number is: " + minNum);
        System.out.println("The biggest number is: " + maxNum);
        int diff;
        if (minNum <= 0){
            diff = ((minNum) + maxNum);
        } else {
            diff = ((maxNum) - minNum);
        }
        System.out.println("The difference between the smallest and the largest number is: " + diff);
    }
}
