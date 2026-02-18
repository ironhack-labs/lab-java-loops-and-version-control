import java.util.Arrays;

class Main{
    public static int minMaxDifference(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max - min;
    }
    public static void smallestElements(int[] arr){
        int min  = arr[0];
        int secMin = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        if(secMin == min){
            secMin = arr[1];
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == min){
                continue;
            }
            if(arr[i] < secMin){
                secMin = arr[i];
            }
        }
        System.out.println(min + " " + secMin);
    }
    public static double calculateFormula(double x, double y){
        double result = Math.pow(x,2) + Math.pow((4*y/5 - x),2);
        return  result;
    }
    public static void main(String[] args){
        System.out.println(minMaxDifference(new int[]{1,2,3,4,5}));
        smallestElements(new int[]{1,2,3,4,5,6,7,8,9,10});
        System.out.println(calculateFormula(1,5));
    }

}