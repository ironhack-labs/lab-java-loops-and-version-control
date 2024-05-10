class exerciseTask1 {
    public static void main(String[] args) {
        int[] numbers = {1, 38, 7, 8, 3, 9, 5, 0, 15, 10};
        int difference = calculateDifference(numbers);
        System.out.println("The difference between the largest and smallest values in array " + difference);
    }
    public static int calculateDifference(int[] arr) {
        if (arr.length < 1) {
            System.out.println("Array must have at least 1 element.");
            return -1;
            }
    int min = arr[0];
    int max = arr[0];

for (int i = 1; i < arr.length; i++) {
    if (arr[i] < min) {
        min = arr[i];
        System.out.println("min = " + min);
    }
    if (arr[i] > max) {
        max = arr[i];
        System.out.println("The maximum value is " + max);
    }
}
      return max- min;}
    {
    }
}




class exerciseTask2 {
    public static void main(String[] args) {
        // Method that find Smallest and SecondSmallest
        double[] element = {0.1, 0.2, 6.2, 5.8, 0.1, 9.2, 10.4, 3.3, 2.7};
        System.out.print("Array must have at least 1 Element");
        double smallest = element[0];

        double secondSmallest = Double.MAX_VALUE;
        for (int i = 0; i < element.length; i++) {

            if (element[i] == smallest) {
                smallest = element[i];
                System.out.println("smallest = " + smallest);
                System.out.println("second Smallest Element in Array " + secondSmallest);


            }
            }
        }
    }





class ExerciseTask3 {
    public static void main(String[] args) {
        int x = 3; //x=3
        double y = 4.5; //y = 4,5
        double result = calculateExpression(x, y);
        System.out.println("The result of the expression is: " + result);
    }
    public static double calculateExpression(int x, double y) {
        return (Math.pow(x , 2)+Math.pow((((4 * y)/5 )-x),2));}
    //return (3 * x) + (4 * y);}
    }



