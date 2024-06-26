public class SmallestAndSecondSmallest {
    public static void main(String[] args) {
        int[] array = {2, 77, 144, 37, 299};

        //find the smallest and second smallest element
        int[] smallestTwo = findSmallestAndSecondSmallest(array);

        //print results
        System.out.println("The smallest element is: " + smallestTwo[0]);
        System.out.println("The second smallest element is: " + smallestTwo[1]);

    }

    public static int[] findSmallestAndSecondSmallest(int[] array){

        //
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : array){
            if (num < smallest){
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        if (secondSmallest == Integer.MAX_VALUE){
            secondSmallest = smallest;
        }

        int[] results = {smallest, secondSmallest};
        return results;
    }
}