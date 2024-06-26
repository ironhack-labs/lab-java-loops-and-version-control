public class ArrayTwo {
    public static void main(String[] args) {
    /*
Task 2
Write a Java method that finds the smallest and second smallest elements
 of a given array and prints them to the console.

        int arrayTwo[] = {11, 5, 23, 8};

        Arrays.sort(arrayTwo);
        System.out.println(Arrays.toString(arrayTwo));

        int minimumElement = arrayTwo[0];
       // for (int s = 0; s < arrayTwo.length; s++) {
          //  if (arrayTwo[s] < minimumElement)
              //  minimumElement = arrayTwo[s];
                System.out.println();
                int maximumElement = arrayTwo.length - 1;

        System.out.println("Task 2");
        System.out.println("Maximum element from array is: " + maximumElement);
        System.out.println("Minimum element from array is: " + minimumElement);
    }
}

     */


                int[] array = {11, 5, 23, 8};

                // Initialize min and secondMin with large values
                int min = Integer.MAX_VALUE;
                int secondMin = Integer.MAX_VALUE;

                // First pass: Find the smallest element
                for (int num : array) {
                    if (num < min) {
                        min = num;
                    }
                }

                // Second pass: Find the second smallest element
                for (int num : array) {
                    if (num < secondMin && num != min) {
                        secondMin = num;
                    }
                }

                // Print the smallest and second smallest elements
                System.out.println("Smallest element: " + min);
                System.out.println("Second smallest element: " + secondMin);
            }
        }