public class Task1 {
    public static void main(String[] args) {

        int[] number = {2,4,7,2,5};
        int big = -2147483648;
        int small = 2147483647 ;
        for (int i=0; i< number.length; i++) {


            if(number[i]>big)
            {
                big = number[i];
            }

        }
        System.out.println("Big value = " +big);
        for (int i=0; i< number.length; i++) {

            //System.out.println(number[i]);
            if(number[i]<small)
            {
                small = number[i];
            }

        }
        System.out.println("Small value = " + small);
        System.out.println("Difference = " + (big-small));

    }
}
