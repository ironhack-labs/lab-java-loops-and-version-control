void main() {
    int[] array={5,7,9,3,1,13};
    System.out.println("Difference between largest and smallest values: "+diffBetweenMinAndMax(array));
    printSmallestAndSecondSmallest(array);
    System.out.println("Result of expression: "+mathExpression(3,5));
}
public static int diffBetweenMinAndMax(int[] numbers){
    int maxNumber=Integer.MIN_VALUE;
    int minNumber=Integer.MAX_VALUE;
    for(int number:numbers){
        if(number>maxNumber) {
            maxNumber = number;
        }
        else if(number<minNumber){
            minNumber=number;
        }
    }
    return maxNumber-minNumber;
}
public static void printSmallestAndSecondSmallest(int[] numbers){
    int smallestNumber=Integer.MAX_VALUE;
    int secondSmallestNumber=Integer.MAX_VALUE;
    for(int number:numbers){
        if(smallestNumber>number) {
            smallestNumber = number;
        }
    }
    for(int number:numbers){
        if(secondSmallestNumber > number && number != smallestNumber) {
            secondSmallestNumber = number;
        }
    }
    System.out.println("Smallest number is: "+smallestNumber+", second smallest number is: "+secondSmallestNumber);

}
public static double mathExpression(int x,int y){
    return Math.pow(x,2)+Math.pow((((double) (4 * y) /5)-x),2);
}

