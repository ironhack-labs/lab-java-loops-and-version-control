import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

                //    Task 1
                int[] numbers = new int[]{6, 2, 8, 9, 5, 1};
                int smallestValue = numbers[0];
                int biggestValue = numbers[0];

                for(int i = 1; i < numbers.length; ++i) {
                    if (numbers[i] > biggestValue) {
                        biggestValue = numbers[i];
                    } else if (numbers[i] < smallestValue) {
                        smallestValue = numbers[i];
                    }
                }

                int sum = biggestValue - smallestValue;
                System.out.println("Difference between" +
                        " the biggest and smallest number: " + sum);
                int[] numbers1 = new int[]{6, 2, 8, 3, 5, 4};
                Arrays.sort(numbers1);
                int sum1 = numbers1[5] - numbers1[0];
                System.out.println("Difference solution2: " + sum1);


                //         Task 2

                double[] values = {8.5, 1.5, 9.4, 24.5, 7.12};

                System.out.println(values.length);
                Arrays.sort(values);
                System.out.println("The biggest number: "+values[4]+"\n"
                        +"The second biggest number: "+values[3]);


                //      Task 3

                int x=6;
                int y=15;
                int b=(4*y/5-x);
                int result=0;

                result+=(int)Math.pow(x,2)+(int)Math.pow(b,2);
                System.out.println("Expression result: "+ result);



            }
        }








