public class Task2 {
    public static void main(String[] args) {

        int[] number = {2,4,7,3,5};
        int[] new_number={2,4,7,3,5};
        int small = 2147483647 ;
        int second_smallest = 2147483647;
        for (int i=0; i< number.length; i++) {

            //System.out.println(number[i]);
            if(number[i]<small)
            {
                small = number[i];
            }

        }
        System.out.println("Small value = " + small);
        for (int i=0; i< number.length; i++) {


            if(number[i]!=small)
            {
                new_number[i] = number[i];
            }
            else{
                new_number[i] = 2147483647;
            }
         //   System.out.println("New number value = " + new_number[i]);
        }
        for (int i=0; i< new_number.length; i++) {

            //System.out.println(number[i]);
            if(new_number[i]< second_smallest)
            {
               second_smallest  = new_number[i];
            }

        }
        System.out.println("Second smallest value = " + second_smallest );

    }
}
