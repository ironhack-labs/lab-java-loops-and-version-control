package main;


public class Main {
    public static void main(String[] args) {
      double[] arr={1,2,3,4,5,6};
      double dif=difference(arr);
      System.out.println(dif);
      double secdif=secdiffence(arr);
      System.out.println(secdif);
      double result=XandY(6,7);
      System.out.println(result);
    }
    public static double difference(double[] arr){
        if(arr.length<1){
            System.out.println("Array length cannot be less than 1");
        }
        double max=arr[0];
        double min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
            min=arr[i];

            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max-min;
    }
    public  static double secdiffence(double[] arr){
        double min=Integer.MAX_VALUE;
        double secmin=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]<secmin && arr[i]!=min ){
                secmin=arr[i];
            }
        }
        return secmin-min;
    }
    public  static double XandY(double x,double y){
        double result= Math.pow(x,2)+Math.pow((4*y/5-x),2);
        return result;
    }
}