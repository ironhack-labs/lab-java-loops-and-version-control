public class Main {
    public static void main(String[] args) {
        int[] numbersArray = {2,3,4,9,6,7,8};
        System.out.println(difference(numbersArray));
    }

    public static int difference(int[] numbersArray){
        int largestNumber = 0;
        int smallestNumber = 0;
        for(int number : numbersArray){
           if(number < smallestNumber) smallestNumber = number;
           if(number > largestNumber) largestNumber = number;
        }
        return largestNumber - smallestNumber;
    }
}
