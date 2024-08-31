//Task 1
//Write a Java method that returns the difference between the largest and smallest values in an array of integers.
// The length of the array must be at least 1.

public class Task1 {
    static int findDifference(int[] numbers) {
        int smallestNumber = findSmallestNumber(numbers);
        int biggestNumber = findBiggestNumber(numbers);
        int calculation = biggestNumber - smallestNumber;
        System.out.println("The difference between the largest and smallest values in my array of integers is - " + calculation);
        return calculation;
    }


    static int findSmallestNumber(int[] numbers) {
        int smallest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            for (int secondI = i + 1; secondI < numbers.length; secondI++) {
                if (numbers[i] > numbers[secondI] && smallest > numbers[secondI]) {
                    smallest = numbers[secondI];
                }
            }
        }
        return smallest;
    }

    static int findBiggestNumber(int[] numbers) {
        int biggest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            for (int secondI = i + 1; secondI < numbers.length; secondI++) {
                if (numbers[i] < numbers[secondI] && biggest < numbers[secondI]) {
                    biggest = numbers[secondI];
                }
            }
        }
        return biggest;
    }

    public static void main(String[] args) {
        int[] a = {4, 7, 5, 9, 1, 6};
        findDifference(a);
    }
}