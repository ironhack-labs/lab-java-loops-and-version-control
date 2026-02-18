import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers={5,6,9,5,12,64,89,97,20};
        int[]  onenumber= {1};
        int[] samenumbers = {5,5,5,5,5,5,5};
        int difference=difBetw(numbers);
        System.out.println(difference);
        twoSmallest(numbers);
        twoSmallest(onenumber);
        twoSmallest(samenumbers);
        mathExp(6,5);
    }
    public static int difBetw(int[] array){
        int max=array[0];
        int min=array[1];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){max=array[i];}
            if(array[i]<min){min=array[i];}
        }
        int result=max-min;
        return result;
    }
    public static void twoSmallest(int[] array){
        if (array.length<2){
            System.out.println("We need at least 2 numbers");
        }
        else{
        int min1=array[0];
        int min2=array[0];
        Arrays.sort(array);
        int i=0;
        while(min2 == min1){
          i++;
          min2=array[i];
          if(i>=array.length-1){
              System.out.println("We dont have 2 different numbers");
              break;
          }
      }

        System.out.println(min1);
        System.out.println(min2);
        }
    }
    public static void mathExp(int x, int y){
        double z=4*y/5-x;
       double result=x*x+(z*z);
       System.out.println(result);
    }
}
