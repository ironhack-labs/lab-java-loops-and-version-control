
        public class Smallest {
            public static void main(String[] args) {
                int[] arr = { 10, 20, 30, 40, 50, 60 };
                int n = arr.length;

        //          VARIABLES
                int smallest = Integer.MAX_VALUE;
                int secondSmallest = Integer.MAX_VALUE;

        //           FOR FIND
                for (int i = 0; i < n; i++) {
                    if (arr[i] < smallest) {
                        secondSmallest = smallest;
                        smallest = arr[i];
                    } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                        secondSmallest = arr[i];
                    }
                }
          //           PRINT
                System.out.println("Smallest is: " + smallest);
                System.out.println("Second smallest is: " + secondSmallest);
            }
        }
