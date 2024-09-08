import com.sun.jdi.IntegerValue;

import java.util.Arrays;

public class LabWeek1 {
    public static void main(String[] args) {
        System.out.println("Hello");

// Task1

        int[] numbers = {10, 2, 16, 3, 7};
        System.out.println(" The lenght of the Array is " + numbers.length);

        int smallest = numbers[0];
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) largest = numbers[i];
            else if (numbers[i] < smallest) smallest = numbers[i];
        }
        System.out.println("Largest Number is : " + largest);
        System.out.println("Smallest Number is : " + smallest);
        System.out.println(largest - smallest);


// Task 2

        int [] age = {5, 11, 22, 2, 19};
        Arrays.sort(age);
        System.out.println(Arrays.toString(age));
        System.out.println(age[0]);
        System.out.println(age [1]);

// Task3
        int x = 4;
        int y = 2;
        int c = (4*y/5);
        int result = 0;

                result= (int)Math.pow(x,2)+(int)Math.pow(c,2);
        System.out.println("Result : " + result);





        }

}