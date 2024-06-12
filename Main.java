public class Main {
    public static void main(String[] args) {
        int[] array = {5,5,6,2,8,9,93,34};
        System.out.println(difference(array));

        smallAndSmaller(array);

        System.out.println(equation(1,1));

    }

    public static int difference(int[] array){
        int smallest = array[0];
        int biggest = array[0];
        for (int i = 1; i < array.length; i++){
            if (smallest > array[i]){
                smallest = array[i];
            }
            if (biggest < array[i]){
                biggest = array[i];
            }

        }
        return biggest - smallest;

    }


    public static void smallAndSmaller(int[] array){
        int small = array[1];
        int smaller = array[0];
    for (int i = 0; i < array.length; i ++){
        if (smaller > array[i]){
            smaller = array[i];
        }
        if (small > array[i] && array[i] > smaller || small <= smaller){
            small = array[i];

        }
    }
        System.out.println("The smallest number is: " + smaller);
        System.out.println("The second smallest number is: " + small);

    }

    public static double equation(double x, double y){
        return Math.pow(x,2) + Math.pow(((4*y)/5)-x, 2);


}
}
