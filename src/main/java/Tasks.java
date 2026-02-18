package main.java;

public class Tasks {
    public  int findingDifference(int[] arr){

        if(arr.length == 0){
            return 0;
        }
        int min=arr[0];
        int max=arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }

        }
        return max-min;
    }

    public  void  findingSmallestAndSecondSmallest(int[] arr){
        if (arr == null || arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;


        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Second Smallest: " + secondSmallest);


    }



    public void calculateMath( int x, int y){
        double result = 4/5*y-x;
        System.out.println(x*x+result*result);

    }
}
