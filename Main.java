public class Main {
    public static void main(String[] args) {
        int []arr = {8,9,12,16,5,3,6};
        int min = arr [0];
        int max = arr [0];

        for (int i =0; i < arr.length; i++ ){
            if (arr[i]< min) {
                min = arr[i];
            }
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        int diff = max-min;

        System.out.println("Smallest value is =" + min);
        System.out.println("Largest value is =" + max);
        System.out.println("The difference between the largest value and the smallest value is =" +diff);
        }


    }




