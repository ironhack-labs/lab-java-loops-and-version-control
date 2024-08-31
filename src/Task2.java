//Task 2
//Write a Java method that finds the smallest and second smallest elements of a given array and prints them to the console.

public class Task2 {


    static void findSmallestNumbers(int[] numbers) {
        int smallest = numbers[0];
        int smallest2 = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            for (int secondI = i + 1; secondI < numbers.length; secondI++) {
                if (numbers[i] > numbers[secondI] && smallest > numbers[secondI]) {
                    smallest = numbers[secondI];
                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int secondI = i + 1; secondI < numbers.length; secondI++) {
                if (numbers[i] > numbers[secondI] && smallest2 > numbers[secondI] && smallest < numbers[secondI]) {
                    smallest2 = numbers[secondI];
                }
            }
        }

        System.out.println(smallest);
        System.out.println(smallest2);

    }

    public static void main(String[] args) {
        int[] a = {4, 7, 5, 9, 1, 6};
        findSmallestNumbers(a);
    }
}