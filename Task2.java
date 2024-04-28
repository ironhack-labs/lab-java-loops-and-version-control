public class Task2 {
    public static void findSmallestElements(int []arr){
     int smallest = Integer.MAX_VALUE;
     int secondSmallest = Integer.MAX_VALUE;

     for (int number : arr){
         if (number <smallest){
             secondSmallest = smallest;
             smallest = number;
         } else if (number < secondSmallest && number!=smallest ) {
             secondSmallest=number;

         }
     }
        System.out.println("Smallest element:" +smallest);
        System.out.println("Second Smallest:" +secondSmallest);
    }

    public static void main(String[] args) {
        int [] numbers={8,9,12,16,5,-3,-1,0};
        findSmallestElements(numbers);
    }
}
