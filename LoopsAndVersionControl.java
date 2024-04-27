public class LoopsAndVersionControl {
    //Task 1 : Write a Java method that returns the difference between the largest and smallest values in an array of integers.

    public static void main(String[] args){
        int[] numbers = {15,65,85,26,72,13};
        int minValue = numbers[0];
        for(int i=1; i<numbers.length;i++){
            if(numbers[i]<minValue){
                minValue=numbers[i];


            }
        }
        System.out.println("The smallest value is "+minValue);
        int maxValue = numbers[0];
        for(int i=1; i< numbers.length;i++){
            if(numbers[i]>maxValue){
                maxValue=numbers[i];
            }
        }
        System.out.println("The highest value is "+maxValue);
        int difference = maxValue-minValue;
        System.out.println("The difference between highest and smallest value is " + difference);
        //Task 2 : Write a Java method that finds the smallest and second smallest elements of a given array and prints them to the console.

        int secondsmallestValue = numbers[0];
        for(int i=1; i<numbers.length;i++){
            if(numbers[i]<minValue){
                secondsmallestValue=minValue;
                minValue=numbers[i];
                if(numbers[i]<secondsmallestValue && numbers[i] !=minValue){
                }
                secondsmallestValue=numbers[i];
            }
        }
        System.out.println(("The Smallest Value is "+minValue)+(" Second smallest value is "+secondsmallestValue));
        //Task 3 Write a Java method that calculates the result of the following mathematical expression

        double x = 7;
        double y = 13;
        double  step1 = x*x;
        double step2 = 4*y/5;
        double  step3 = step2-x;
        double  step4 = step3*step3;
        double resolution = step1+step4;{
            System.out.println(resolution);
        }
    }
}

