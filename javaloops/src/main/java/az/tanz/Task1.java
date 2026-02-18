package az.tanz;

public class Task1 {
    public static int diffinArrayRange(int[] arr){
        final int ARR_LEN=arr.length;

        if (ARR_LEN==0){

            System.out.println("====================================");
            System.out.println("ARR_LEN should be more than 0!!");
            System.out.println("====================================");

            return 0;
        }

        int min = arr[0];
        int max = arr[ARR_LEN-1];
        for(int i=1;i<ARR_LEN;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        }


        return (max - min);
    }
}
